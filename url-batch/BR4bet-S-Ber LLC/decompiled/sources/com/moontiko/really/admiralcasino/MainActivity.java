package com.moontiko.really.admiralcasino;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moontiko.really.admiralcasino.MainActivity;
import com.moontiko.really.admiralcasino.MainActivity2;
import com.moontiko.really.admiralcasino.R;
import defpackage.a80;
import defpackage.aj;
import defpackage.bj;
import defpackage.cj;
import defpackage.dj;
import defpackage.e80;
import defpackage.la;
import defpackage.m3;
import defpackage.rn;
import defpackage.v1;
import defpackage.wi;
import defpackage.xi;
import defpackage.yi;
import defpackage.ze;
import defpackage.zi;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class MainActivity extends m3 {
    public static final /* synthetic */ int L = 0;
    public final a80 E;
    public String F;
    public SharedPreferences I;
    public final a80 K;
    public final String G = r(new byte[]{-114, 54, -118});
    public final String H = r(new byte[]{-97, 37, -97, 60});
    public final a80 J = new a80(new v1(1));

    public MainActivity() {
        final int i = 0;
        this.E = new a80(new rn(this) { // from class: gu
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.rn
            public final Object a() {
                int i2 = i;
                MainActivity mainActivity = this.g;
                switch (i2) {
                    case 0:
                        int i3 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) la0.t(inflate, R.id.progressBar)) != null) {
                            return new p1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    default:
                        int i4 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
        final int i2 = 1;
        this.K = new a80(new rn(this) { // from class: gu
            public final /* synthetic */ MainActivity g;

            {
                this.g = this;
            }

            @Override // defpackage.rn
            public final Object a() {
                int i22 = i2;
                MainActivity mainActivity = this.g;
                switch (i22) {
                    case 0:
                        int i3 = MainActivity.L;
                        View inflate = mainActivity.getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        if (((ProgressBar) la0.t(inflate, R.id.progressBar)) != null) {
                            return new p1(constraintLayout);
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.progressBar)));
                    default:
                        int i4 = MainActivity.L;
                        return new Intent(mainActivity, (Class<?>) MainActivity2.class);
                }
            }
        });
    }

    public static String r(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            arrayList.add(Byte.valueOf((byte) ((i3 % 2 == 0 ? 237 : 80) ^ (bArr[i2] & 255))));
            i2++;
            i3 = i4;
        }
        byte[] bArr2 = new byte[arrayList.size()];
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            bArr2[i] = ((Number) obj).byteValue();
            i++;
        }
        return new String(bArr2, la.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        r2.run();
        r8 = getWindow();
        r8.getClass();
        r3.a(r8);
        setContentView(((defpackage.p1) r8.E.a()).a);
        r8 = findViewById(com.moontiko.really.admiralcasino.R.id.main);
        r9 = new defpackage.g9(16);
        r2 = defpackage.ic0.a;
        defpackage.ac0.c(r8, r9);
        getWindow().setFlags(1024, 1024);
        r8 = r8.I;
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e1, code lost:
    
        if (r8 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e3, code lost:
    
        r8 = r8.getString(r8.H, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e9, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ef, code lost:
    
        if (defpackage.f70.b0(r8) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f2, code lost:
    
        r8.F = r8;
        t(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        r8 = getPackageName();
        r3 = r(new byte[]{-97, 37, -97, 60});
        r4 = r(new byte[]{-46, 49, -99, 32, -48});
        r8 = r(new byte[]{-123, 36, -103, 32, -98, 106, -62, Byte.MAX_VALUE, -98, 56, -108, 125, -123, 57, -127, 60, -64, 52, -119, 54, -43, 126, -124, 41, -108, 49, -97, 51, -123, 57, -122, 96, -35, 32, -127, 40, -125, 103, -33, 126, -102, 63, -97, 59, -120, 34, -98, 126, -119, 53, -101}) + r4 + r8;
        r4 = new defpackage.rg(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0139, code lost:
    
        if (defpackage.n70.U(r8, "ws:", true) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013b, code lost:
    
        r8 = "http:".concat(r8.substring(3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0159, code lost:
    
        r2 = new defpackage.tq(0);
        r2.f(null, r8);
        r4.f = r2.b();
        r8 = r(new byte[]{-75, 125, -87, 53, -101, 57, -114, 53, -64, 29, -126, 52, -120, 60});
        r2 = android.os.Build.MODEL;
        r2.getClass();
        r4.p(r8, r2);
        r4.p(r(new byte[]{-84, 51, -114, 53, -99, 36, -64, 28, -116, 62, -118, 37, -116, 55, -120}), r(new byte[]{-120, 62, -64, 5, -66, 124, -120, 62, -42, 33, -48, 96, -61, 105}));
        r8 = r(new byte[]{-72, 35, -120, 34, -64, 17, -118, 53, -125, 36});
        r2 = android.webkit.WebSettings.getDefaultUserAgent(r8);
        r2.getClass();
        r4.p(r8, r2);
        r8 = r4.d();
        r2 = (defpackage.xy) r8.J.a();
        r2.getClass();
        r4 = new defpackage.i10(r2, r8);
        r5 = new defpackage.a5(r8, r3, 20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c9, code lost:
    
        if (r4.j.compareAndSet(false, true) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01cb, code lost:
    
        r0 = defpackage.zz.a;
        r4.k = defpackage.zz.a.g();
        r1 = r2.f;
        r0 = new defpackage.f10(r4, r5);
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01df, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e0, code lost:
    
        ((java.util.ArrayDeque) r1.g).add(r0);
        r8 = r8.a.d;
        r2 = ((java.util.ArrayDeque) r1.h).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f7, code lost:
    
        if (r2.hasNext() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f9, code lost:
    
        r3 = (defpackage.f10) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x020b, code lost:
    
        if (defpackage.kr.b(r3.h.g.a.d, r8) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x020d, code lost:
    
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0232, code lost:
    
        if (r9 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0234, code lost:
    
        r0.g = r9.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0238, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0239, code lost:
    
        r1.x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x023c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x020f, code lost:
    
        r2 = ((java.util.ArrayDeque) r1.g).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x021b, code lost:
    
        if (r2.hasNext() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x021d, code lost:
    
        r3 = (defpackage.f10) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x022f, code lost:
    
        if (defpackage.kr.b(r3.h.g.a.d, r8) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0241, code lost:
    
        defpackage.g9.s("Already Executed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0246, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        if (defpackage.n70.U(r8, "wss:", true) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
    
        r8 = "https:".concat(r8.substring(4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0247, code lost:
    
        defpackage.kr.g0("prefs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024c, code lost:
    
        throw null;
     */
    @Override // defpackage.m3, defpackage.wc, defpackage.vc, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences(this.G, 0);
        sharedPreferences.getClass();
        this.I = sharedPreferences;
        e80 e80Var = new e80(0, 0, new ze(1));
        e80 e80Var2 = new e80(yi.a, yi.b, new ze(1));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        zi ziVar = yi.c;
        if (ziVar == null) {
            int i = Build.VERSION.SDK_INT;
            ziVar = i >= 35 ? new dj() : i >= 30 ? new cj() : i >= 29 ? new bj() : i >= 28 ? new aj() : new zi();
            yi.c = ziVar;
        }
        zi ziVar2 = ziVar;
        wi wiVar = new wi(ziVar2, e80Var, e80Var2, this, decorView);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                xi xiVar = new xi(wiVar, viewGroup.getContext());
                xiVar.setTag(ziVar2);
                xiVar.setVisibility(8);
                xiVar.setWillNotDraw(true);
                viewGroup.addView(xiVar);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof zi) {
                break;
            } else {
                i2 = i3;
            }
        }
    }

    @Override // defpackage.m3, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.F;
        if (str != null) {
            t(str);
        }
    }

    public final void s() {
        startActivity((Intent) this.K.a());
    }

    public final void t(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (Exception unused) {
            s();
        }
    }
}
