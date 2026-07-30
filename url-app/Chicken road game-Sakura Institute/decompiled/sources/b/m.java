package b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1183a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1184b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1185c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1186d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f1187e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f1188f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f1189g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f1190h;

    public m(o oVar) {
        this.f1190h = oVar;
    }

    public final boolean a(int i7, int i8, Intent intent) {
        String str = (String) this.f1183a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        e.c cVar = (e.c) this.f1187e.get(str);
        if ((cVar != null ? cVar.f2656a : null) != null) {
            ArrayList arrayList = this.f1186d;
            if (arrayList.contains(str)) {
                cVar.f2656a.a(cVar.f2657b.C(intent, i8));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1188f.remove(str);
        this.f1189g.putParcelable(str, new e.a(intent, i8));
        return true;
    }

    public final void b(int i7, a.a aVar, Object obj) {
        Bundle bundle;
        int i8;
        o oVar = this.f1190h;
        b6.c y4 = aVar.y(oVar, obj);
        if (y4 != null) {
            new Handler(Looper.getMainLooper()).post(new l(i7, 0, this, y4));
            return;
        }
        Intent r8 = aVar.r(oVar, obj);
        if (r8.getExtras() != null) {
            Bundle extras = r8.getExtras();
            r6.k.c(extras);
            if (extras.getClassLoader() == null) {
                r8.setExtrasClassLoader(oVar.getClassLoader());
            }
        }
        if (r8.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = r8.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            r8.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(r8.getAction())) {
            String[] stringArrayExtra = r8.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i9 = 0; i9 < stringArrayExtra.length; i9++) {
                if (TextUtils.isEmpty(stringArrayExtra[i9])) {
                    throw new IllegalArgumentException(a0.m.m(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i9], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i9));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                    if (!hashSet.contains(Integer.valueOf(i11))) {
                        strArr[i10] = stringArrayExtra[i11];
                        i10++;
                    }
                }
            }
            s2.a.b(oVar, stringArrayExtra, i7);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(r8.getAction())) {
            oVar.startActivityForResult(r8, i7, bundle2);
            return;
        }
        e.f fVar = (e.f) r8.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            r6.k.c(fVar);
            i8 = i7;
            try {
                oVar.startIntentSenderForResult(fVar.f2661f, i8, fVar.f2662g, fVar.f2663h, fVar.f2664i, 0, bundle2);
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                new Handler(Looper.getMainLooper()).post(new l(i8, 1, this, e));
            }
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i8 = i7;
        }
    }
}
