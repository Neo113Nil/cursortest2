package S0;

import B1.z;
import J0.u;
import J0.w;
import J0.x;
import O.C0357t;
import a4.C0428a;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C;
import androidx.work.impl.WorkDatabase_Impl;
import com.anythink.banner.api.ATBannerListener;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.icefishing.icefishingliveapp.C5284R;
import com.icefishing.icefishingliveapp.GzopActiongamesActivity;
import com.icefishing.icefishingliveapp.GzopStretegygamesActivity;
import e8.y;
import h.AbstractActivityC4553l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Random;
import k4.InterfaceC4657l;
import k4.ViewOnClickListenerC4655j;
import n.C4798b;
import n.C4800d;
import org.json.JSONException;
import org.json.JSONObject;
import pl.droidsonroids.gif.GifImageView;
import t0.AbstractC5032P;
import t0.Z;
import u.AbstractC5088e;
import u.C5089f;
import u0.C5098i;
import v1.InterfaceC5117a;
import w1.C5149b;

/* loaded from: classes.dex */
public final class e implements B1.n, x, H2.a, InterfaceC4657l, ATBannerListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2890n;

    /* renamed from: u, reason: collision with root package name */
    public Object f2891u;

    /* renamed from: v, reason: collision with root package name */
    public Object f2892v;

    public /* synthetic */ e(int i, Object obj) {
        this.f2890n = i;
        this.f2892v = obj;
    }

    @Override // k4.InterfaceC4657l
    public void OnCall() {
        switch (this.f2890n) {
            case 10:
                ((GzopActiongamesActivity) this.f2892v).startActivity((Intent) this.f2891u);
                break;
            default:
                ((GzopStretegygamesActivity) this.f2892v).startActivity((Intent) this.f2891u);
                break;
        }
    }

    @Override // H2.a
    public h3.n a() {
        h3.n a9 = ((Y2.g) this.f2891u).a();
        h4.c cVar = new h4.c(14, this);
        a9.getClass();
        return a9.e(h3.i.f38207a, cVar);
    }

    public void b(AbstractC5032P abstractC5032P, C0357t c0357t) {
        s.k kVar = (s.k) this.f2891u;
        Z z8 = (Z) kVar.getOrDefault(abstractC5032P, null);
        if (z8 == null) {
            z8 = Z.a();
            kVar.put(abstractC5032P, z8);
        }
        z8.f40666c = c0357t;
        z8.f40664a |= 8;
    }

    @Override // B1.n
    public void c() {
        z zVar = (z) this.f2891u;
        synchronized (zVar) {
            zVar.f137v = zVar.f135n.length;
        }
    }

    @Override // B1.n
    public void d(Bitmap bitmap, InterfaceC5117a interfaceC5117a) {
        IOException iOException = ((N1.e) this.f2892v).f1958u;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC5117a.d(bitmap);
            throw iOException;
        }
    }

    public File e() {
        if (((File) this.f2891u) == null) {
            this.f2891u = new File(((Context) this.f2892v).getCacheDir(), "volley");
        }
        return (File) this.f2891u;
    }

    public File f() {
        if (((File) this.f2891u) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f2891u) == null) {
                        K3.g gVar = (K3.g) this.f2892v;
                        gVar.a();
                        this.f2891u = new File(gVar.f1623a.getFilesDir(), "PersistedInstallation." + ((K3.g) this.f2892v).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f2891u;
    }

    public Long g(String str) {
        C5098i a9 = C5098i.a(1, "SELECT long_value FROM Preference where `key`=?");
        a9.c(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2891u;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            Long l9 = null;
            if (m8.moveToFirst() && !m8.isNull(0)) {
                l9 = Long.valueOf(m8.getLong(0));
            }
            return l9;
        } finally {
            m8.close();
            a9.j();
        }
    }

    public void h(C0428a c0428a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c0428a.f4376a);
            jSONObject.put("Status", AbstractC5088e.d(c0428a.f4377b));
            jSONObject.put("AuthToken", c0428a.f4378c);
            jSONObject.put("RefreshToken", c0428a.f4379d);
            jSONObject.put("TokenCreationEpochInSecs", c0428a.f4381f);
            jSONObject.put("ExpiresInSecs", c0428a.f4380e);
            jSONObject.put("FisError", c0428a.f4382g);
            K3.g gVar = (K3.g) this.f2892v;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f1623a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(f())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void i(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2891u;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f2892v).q(dVar);
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
        }
    }

    public void j(W2.e eVar) {
        boolean z8;
        C c4 = (C) this.f2891u;
        synchronized (c4.f5203a) {
            z8 = c4.f5208f == C.f5202k;
            c4.f5208f = eVar;
        }
        if (z8) {
            C4798b J = C4798b.J();
            F3.C c9 = c4.f5211j;
            C4800d c4800d = J.f39614n;
            if (c4800d.f39618v == null) {
                synchronized (c4800d.f39616n) {
                    try {
                        if (c4800d.f39618v == null) {
                            c4800d.f39618v = C4800d.J(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            c4800d.f39618v.post(c9);
        }
        if (eVar instanceof w) {
            ((U0.k) this.f2892v).j((w) eVar);
        } else if (eVar instanceof u) {
            ((U0.k) this.f2892v).k(((u) eVar).f1334k);
        }
    }

    public void k(e8.w wVar) {
        y yVar = wVar.f37536z;
        try {
            ((I6.a) this.f2892v).accept(new O6.c(wVar, yVar));
            if (yVar != null) {
                yVar.close();
            }
        } catch (Throwable th) {
            if (yVar != null) {
                try {
                    yVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C0357t l(AbstractC5032P abstractC5032P, int i) {
        Z z8;
        C0357t c0357t;
        s.k kVar = (s.k) this.f2891u;
        int e6 = kVar.e(abstractC5032P);
        if (e6 >= 0 && (z8 = (Z) kVar.l(e6)) != null) {
            int i4 = z8.f40664a;
            if ((i4 & i) != 0) {
                int i9 = i4 & (~i);
                z8.f40664a = i9;
                if (i == 4) {
                    c0357t = z8.f40665b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0357t = z8.f40666c;
                }
                if ((i9 & 12) == 0) {
                    kVar.j(e6);
                    z8.f40664a = 0;
                    z8.f40665b = null;
                    z8.f40666c = null;
                    Z.f40663d.c(z8);
                }
                return c0357t;
            }
        }
        return null;
    }

    public C0428a m() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(f());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = AbstractC5088e.e(5)[optInt];
        if (i == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C0428a(optString, i, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void n(String str) {
        C5149b c5149b;
        synchronized (this) {
            try {
                c5149b = (C5149b) ((HashMap) this.f2891u).get(str);
                N1.g.c(c5149b, "Argument must not be null");
                int i = c5149b.f41585b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c5149b.f41585b);
                }
                int i4 = i - 1;
                c5149b.f41585b = i4;
                if (i4 == 0) {
                    C5149b c5149b2 = (C5149b) ((HashMap) this.f2891u).remove(str);
                    if (!c5149b2.equals(c5149b)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c5149b + ", but actually removed: " + c5149b2 + ", safeKey: " + str);
                    }
                    h8.d dVar = (h8.d) this.f2892v;
                    synchronized (((ArrayDeque) dVar.f38261u)) {
                        if (((ArrayDeque) dVar.f38261u).size() < 10) {
                            ((ArrayDeque) dVar.f38261u).offer(c5149b2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c5149b.f41584a.unlock();
    }

    public void o(AbstractC5032P abstractC5032P) {
        Z z8 = (Z) ((s.k) this.f2891u).getOrDefault(abstractC5032P, null);
        if (z8 == null) {
            return;
        }
        z8.f40664a &= -2;
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerAutoRefreshFail(AdError adError) {
        if (k4.m.f38791g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f2891u);
            ViewGroup viewGroup = (ViewGroup) this.f2892v;
            View inflate = from.inflate(C5284R.layout.qureka_nativebanner_layout, viewGroup, false);
            k4.m.d(inflate.findViewById(C5284R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5284R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5284R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5284R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(k4.m.f38782P[nextInt]);
            textView2.setText(k4.m.f38783Q[nextInt]);
            gifImageView.setImageResource(k4.m.f38784R[nextInt]);
            inflate.findViewById(C5284R.id.bannerclick).setOnClickListener(new ViewOnClickListenerC4655j(this, 1));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerFailed(AdError adError) {
        if (k4.m.f38791g == 1) {
            LayoutInflater from = LayoutInflater.from((Context) this.f2891u);
            ViewGroup viewGroup = (ViewGroup) this.f2892v;
            View inflate = from.inflate(C5284R.layout.qureka_nativebanner_layout, viewGroup, false);
            k4.m.d(inflate.findViewById(C5284R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5284R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5284R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5284R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(k4.m.f38782P[nextInt]);
            textView2.setText(k4.m.f38783Q[nextInt]);
            gifImageView.setImageResource(k4.m.f38784R[nextInt]);
            inflate.findViewById(C5284R.id.bannerclick).setOnClickListener(new ViewOnClickListenerC4655j(this, 0));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    public void p(AbstractC5032P abstractC5032P) {
        s.e eVar = (s.e) this.f2892v;
        int l9 = eVar.l() - 1;
        while (true) {
            if (l9 < 0) {
                break;
            }
            if (abstractC5032P == eVar.m(l9)) {
                Object[] objArr = eVar.f40386v;
                Object obj = objArr[l9];
                Object obj2 = s.e.f40383x;
                if (obj != obj2) {
                    objArr[l9] = obj2;
                    eVar.f40384n = true;
                }
            } else {
                l9--;
            }
        }
        Z z8 = (Z) ((s.k) this.f2891u).remove(abstractC5032P);
        if (z8 != null) {
            z8.f40664a = 0;
            z8.f40665b = null;
            z8.f40666c = null;
            Z.f40663d.c(z8);
        }
    }

    public void q(int i, int i4, int i9, int i10) {
        CardView cardView = (CardView) this.f2892v;
        cardView.f4755w.set(i, i4, i9, i10);
        Rect rect = cardView.f4754v;
        super/*android.view.View*/.setPadding(i + rect.left, i4 + rect.top, i9 + rect.right, i10 + rect.bottom);
    }

    public String toString() {
        switch (this.f2890n) {
            case 5:
                return "Bounds{lower=" + ((G.e) this.f2891u) + " upper=" + ((G.e) this.f2892v) + "}";
            case 18:
                String str = "[ ";
                if (((C5089f) this.f2891u) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder b9 = AbstractC5088e.b(str);
                        b9.append(((C5089f) this.f2891u).f40989A[i]);
                        b9.append(" ");
                        str = b9.toString();
                    }
                }
                StringBuilder c4 = AbstractC5088e.c(str, "] ");
                c4.append((C5089f) this.f2891u);
                return c4.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f2890n = i;
        this.f2891u = obj;
        this.f2892v = obj2;
    }

    public e(Context context, int i) {
        Y2.e eVar;
        this.f2890n = i;
        switch (i) {
            case 15:
                this.f2892v = context;
                this.f2891u = null;
                return;
            default:
                this.f2891u = new Y2.g(context, L2.f.f1726b);
                synchronized (Y2.e.class) {
                    try {
                        if (Y2.e.f3960x == null) {
                            Y2.e.f3960x = new Y2.e(context.getApplicationContext());
                        }
                        eVar = Y2.e.f3960x;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f2892v = eVar;
                return;
        }
    }

    public /* synthetic */ e(AbstractActivityC4553l abstractActivityC4553l, Intent intent, int i) {
        this.f2890n = i;
        this.f2892v = abstractActivityC4553l;
        this.f2891u = intent;
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f2890n = 0;
        this.f2891u = workDatabase_Impl;
        this.f2892v = new b(workDatabase_Impl, 1);
    }

    public e(int i) {
        this.f2890n = i;
        switch (i) {
            case 17:
                this.f2891u = new s.k();
                this.f2892v = new s.e();
                break;
            case 18:
            default:
                this.f2891u = new C();
                this.f2892v = new U0.k();
                j(x.f1336g0);
                break;
            case 19:
                this.f2891u = new HashMap();
                this.f2892v = new h8.d(11);
                break;
        }
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerLoaded() {
    }

    public e(K6.a aVar) {
        this.f2890n = 4;
        this.f2891u = aVar;
    }

    public e(EditText editText) {
        this.f2890n = 9;
        this.f2891u = editText;
        c0.i iVar = new c0.i(editText);
        this.f2892v = iVar;
        editText.addTextChangedListener(iVar);
        if (c0.a.f5635b == null) {
            synchronized (c0.a.f5634a) {
                try {
                    if (c0.a.f5635b == null) {
                        c0.a aVar = new c0.a();
                        try {
                            c0.a.f5636c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c0.a.f5635b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(c0.a.f5635b);
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerAutoRefreshed(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerClicked(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerClose(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.banner.api.ATBannerListener
    public void onBannerShow(ATAdInfo aTAdInfo) {
    }
}
