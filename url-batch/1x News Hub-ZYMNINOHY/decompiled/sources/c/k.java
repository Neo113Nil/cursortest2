package c;

import U1.C0080a;
import a.AbstractC0129a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import e.C0304a;
import e.C0307d;
import e.C0309f;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2575a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2576b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2577c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2578d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f2579e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2580g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m f2581h;

    public k(m mVar) {
        this.f2581h = mVar;
    }

    public final boolean a(int i3, int i4, Intent intent) {
        String str = (String) this.f2575a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        C0307d c0307d = (C0307d) this.f2579e.get(str);
        if ((c0307d != null ? c0307d.f4958a : null) != null) {
            ArrayList arrayList = this.f2578d;
            if (arrayList.contains(str)) {
                c0307d.f4958a.c(new C0304a(intent, i4));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.f2580g.putParcelable(str, new C0304a(intent, i4));
        return true;
    }

    public final void b(int i3, C0080a c0080a, C0309f c0309f) {
        Bundle bundle;
        int i4;
        m context = this.f2581h;
        kotlin.jvm.internal.j.e(context, "context");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0309f);
        kotlin.jvm.internal.j.d(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        if (putExtra.getExtras() != null) {
            Bundle extras = putExtra.getExtras();
            kotlin.jvm.internal.j.b(extras);
            if (extras.getClassLoader() == null) {
                putExtra.setExtrasClassLoader(context.getClassLoader());
            }
        }
        if (putExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = putExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            putExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(putExtra.getAction())) {
            String[] stringArrayExtra = putExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0129a.w(context, stringArrayExtra, i3);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(putExtra.getAction())) {
            context.startActivityForResult(putExtra, i3, bundle2);
            return;
        }
        C0309f c0309f2 = (C0309f) putExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.j.b(c0309f2);
            i4 = i3;
            try {
                context.startIntentSenderForResult(c0309f2.f4961a, i4, c0309f2.f4962b, c0309f2.f4963c, c0309f2.f4964d, 0, bundle2);
            } catch (IntentSender.SendIntentException e3) {
                e = e3;
                new Handler(Looper.getMainLooper()).post(new S.a(this, i4, e, 1));
            }
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            i4 = i3;
        }
    }
}
