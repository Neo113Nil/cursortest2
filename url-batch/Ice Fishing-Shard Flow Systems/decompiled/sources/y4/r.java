package y4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import z4.C1059a;

/* loaded from: classes.dex */
public final class r implements q6.d, z4.e {

    /* renamed from: d, reason: collision with root package name */
    public final Object f8618d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8619e;

    /* renamed from: i, reason: collision with root package name */
    public Object f8620i;

    public r(Context context) {
        H0.l lVar = new H0.l(context);
        this.f8618d = context;
        this.f8619e = lVar;
    }

    public static Bundle a(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public boolean b(String str, boolean z7, z4.j jVar, C1059a c1059a) {
        Map map = jVar.f8729c;
        if (((Activity) this.f8620i) == null) {
            throw new z4.b();
        }
        Bundle a7 = a(map);
        if (z7) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    Activity activity = (Activity) this.f8620i;
                    q.h hVar = new q.h();
                    hVar.f7288a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", c1059a.f8716a ? 1 : 0);
                    q.i a8 = hVar.a();
                    Intent intent = a8.f7295a;
                    intent.putExtra("com.android.browser.headers", a7);
                    try {
                        intent.setData(parse);
                        activity.startActivity(intent, a8.f7296b);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        Activity activity2 = (Activity) this.f8620i;
        boolean z8 = jVar.f8727a;
        boolean z9 = jVar.f8728b;
        int i2 = WebViewActivity.f5782m;
        try {
            ((Activity) this.f8620i).startActivity(new Intent(activity2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z8).putExtra("enableDomStorage", z9).putExtra("com.android.browser.headers", a7));
            return true;
        } catch (ActivityNotFoundException unused2) {
            return false;
        }
    }

    @Override // q6.d
    public Object e(q6.e eVar, V5.b bVar) {
        Object e7 = ((q6.d) this.f8618d).e(new q6.l(eVar, (T.d) this.f8619e, (K) this.f8620i), bVar);
        return e7 == W5.a.f2787d ? e7 : Unit.f6114a;
    }

    public r(q6.d dVar, T.d dVar2, K k7) {
        this.f8618d = dVar;
        this.f8619e = dVar2;
        this.f8620i = k7;
    }
}
