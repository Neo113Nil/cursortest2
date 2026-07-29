package com.cmplay.b;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.cmplay.b.c;
import com.cmplay.base.util.s;
import com.cmplay.internalpush.k;
import com.dancingbogo.skyrolline.AppActivity;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.R;
import com.dancingbogo.skyrolline.util.NativeUtil;
import com.dancingbogo.skyrolline.util.l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: ShareHelper.java */
/* loaded from: classes.dex */
public class g implements d {

    /* renamed from: d, reason: collision with root package name */
    private static SimpleDateFormat f3929d = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    private a f3930a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<d> f3931b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private long f3932c = 0;

    /* compiled from: ShareHelper.java */
    public interface a {
    }

    /* compiled from: ShareHelper.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final g f3937a = new g();
    }

    public static g a() {
        return b.f3937a;
    }

    public boolean a(Activity activity, f fVar, int i) {
        if (!c()) {
            return false;
        }
        b();
        com.cmplay.b.a.b bVar = new com.cmplay.b.a.b(activity, i);
        a(bVar);
        bVar.a(fVar);
        return true;
    }

    public boolean a(Activity activity, f fVar) {
        return a(new com.cmplay.b.a.b(activity, 3), fVar);
    }

    public boolean b(Activity activity, f fVar) {
        return a(new com.cmplay.b.a.d(activity), fVar);
    }

    private boolean a(com.cmplay.b.a.c cVar, f fVar) {
        if (!b(cVar.a())) {
            return false;
        }
        b();
        cVar.a(fVar);
        a(cVar);
        return true;
    }

    public void c(Activity activity, f fVar) {
        b();
        com.cmplay.b.a.a aVar = new com.cmplay.b.a.a(activity);
        aVar.a(fVar);
        a(aVar);
    }

    private boolean c() {
        if (d()) {
            return true;
        }
        com.dancingbogo.skyrolline.util.d.c(GameApp.f4485a.getString(R.string.share_fb_have_no_network));
        return false;
    }

    private boolean b(String str) {
        if (!d()) {
            com.dancingbogo.skyrolline.util.d.c(GameApp.f4485a.getString(R.string.share_fb_have_no_network));
            return false;
        }
        if (a(str)) {
            return true;
        }
        com.dancingbogo.skyrolline.util.d.c(GameApp.f4485a.getString(R.string.app_not_found));
        return false;
    }

    @Override // com.cmplay.b.d
    public void a(int i, int i2, Intent intent) {
        if (this.f3931b == null || this.f3931b.size() == 0) {
            return;
        }
        com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper onActivityResult size=" + this.f3931b.size());
        Iterator<d> it = this.f3931b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper onActivityResult " + next);
            next.a(i, i2, intent);
        }
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            GameApp.f4485a.getPackageManager().getPackageInfo(str, 256);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(d dVar) {
        com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper registerActivityResult abc " + dVar);
        if (this.f3931b.size() == 0) {
            this.f3931b.add(dVar);
            com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper registerActivityResult add " + dVar);
            com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper after registerActivityResult size=" + this.f3931b.size());
            return;
        }
        boolean z = false;
        Iterator<d> it = this.f3931b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().equals(dVar)) {
                z = true;
                break;
            }
        }
        if (!z) {
            com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper registerActivityResult add " + dVar);
            this.f3931b.add(dVar);
        } else {
            com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper registerActivityResult exist,not add" + dVar);
        }
        com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper after registerActivityResult size=" + this.f3931b.size());
    }

    public void b(d dVar) {
        if (this.f3931b.size() == 0) {
            return;
        }
        com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper unRegisterActivityResult " + dVar);
        com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper before unRegisterActivityResult size=" + this.f3931b.size());
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f3931b.size()) {
                break;
            }
            if (this.f3931b.get(i2).equals(dVar)) {
                com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper unRegisterActivityResult remove" + dVar);
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            this.f3931b.remove(i);
        }
        com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper after unRegisterActivityResult size=" + this.f3931b.size());
    }

    public void b() {
        this.f3931b.clear();
        com.dancingbogo.skyrolline.util.b.a("MMM", "ShareHelper mActivityResultList destory ");
    }

    private boolean d() {
        return l.c(GameApp.f4485a);
    }

    public void d(Activity activity, f fVar) {
        int f = fVar.f();
        if (f != 9) {
            switch (f) {
                case 1:
                    a(activity, fVar, 1);
                    break;
                case 2:
                    a(activity, fVar, 2);
                    break;
                case 3:
                    a(activity, fVar);
                    break;
                case 4:
                    b(activity, fVar);
                    break;
                case 5:
                    c(activity, fVar);
                    break;
            }
        }
        a(activity, fVar, 4);
    }

    public void a(a aVar) {
        this.f3930a = aVar;
    }

    public void a(long j) {
        this.f3932c = j;
    }

    public void a(int i, int i2, int i3, int i4) {
        if (i4 == 2) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("uptime=");
        sb.append(String.valueOf(currentTimeMillis / 1000));
        sb.append("&network=");
        sb.append(String.valueOf(s.a(k.f4264a) + "&scenes=" + i + "&type1=0&area1=" + i3 + "&action=" + i4));
        NativeUtil.getInstance().reportInfoc("rollingsky_games_sharedata", sb.toString(), true);
    }

    public void a(int i, String str, String str2, long j) {
        l.a(GameApp.f4485a);
        l.b(l.a(str2));
    }

    public void a(int i, final int i2, final String str, final String str2, final String str3, String str4) {
        e.a();
        e.f3923c = i2;
        e.f3924d = i;
        e.e = str2;
        if (1 == e.f3924d) {
            if (com.dancingbogo.skyrolline.util.g.b()) {
                c.a("rs_rank", str4, new c.a() { // from class: com.cmplay.b.g.1
                    @Override // com.cmplay.b.c.a
                    public void a(boolean z) {
                        g.this.a(i2, str, str2, str3, z);
                    }
                });
            } else {
                a(i2, str, str2, str3, false);
            }
        } else if (e.f3924d != 0) {
            int i3 = e.f3924d;
        }
        com.cmplay.b.b.a().a("clk_share_btn_result_pg");
    }

    public void a(int i, String str, String str2, String str3, boolean z) {
        if (!l.c(GameApp.f4485a)) {
            com.dancingbogo.skyrolline.util.d.c(GameApp.f4485a.getString(R.string.share_fb_have_no_network));
            return;
        }
        com.dancingbogo.skyrolline.util.d.a("chmod 777 " + str3);
        f fVar = new f();
        fVar.d(str);
        fVar.b(str2);
        fVar.c(str3);
        fVar.c(i);
        Activity activityRef = AppActivity.getActivityRef();
        if (activityRef == null) {
            return;
        }
        if (com.dancingbogo.skyrolline.util.g.b() && z) {
            fVar.a(2, i);
            a(activityRef, fVar, 2);
        } else {
            fVar.b(5);
            c(activityRef, fVar);
        }
    }

    public void a(int i, String str) {
        if (!l.c(GameApp.f4485a)) {
            com.dancingbogo.skyrolline.util.d.c(GameApp.f4485a.getString(R.string.share_fb_have_no_network));
            return;
        }
        e.f3924d = 1;
        e.f3923c = i;
        com.dancingbogo.skyrolline.util.d.a("chmod 777 " + str);
        f fVar = new f();
        fVar.b("");
        fVar.c(str);
        fVar.d(2);
        Activity activityRef = AppActivity.getActivityRef();
        if (activityRef == null) {
            return;
        }
        if (com.dancingbogo.skyrolline.util.g.b()) {
            fVar.a(2, i);
            a(activityRef, fVar, 2);
        } else {
            fVar.a(5, i);
            c(activityRef, fVar);
        }
    }
}
