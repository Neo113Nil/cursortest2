package com.winfour.neondrop.ui;

import D.j;
import D.p;
import J.i;
import O0.ViewOnClickListenerC0025a;
import U0.b;
import U0.e;
import U0.f;
import U0.g;
import V0.a;
import W0.d;
import Y0.c;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.winfour.neondrop.R;
import com.winfour.neondrop.game.ConnectFourView;
import com.winfour.neondrop.ui.GameActivity;
import g.AbstractActivityC0110i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class GameActivity extends AbstractActivityC0110i implements b {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f2101G = 0;

    /* renamed from: C, reason: collision with root package name */
    public int f2104C;

    /* renamed from: D, reason: collision with root package name */
    public int f2105D;

    /* renamed from: E, reason: collision with root package name */
    public i f2106E;

    /* renamed from: y, reason: collision with root package name */
    public final d f2108y = new d(new a(this, 0));

    /* renamed from: z, reason: collision with root package name */
    public final Handler f2109z = new Handler(Looper.getMainLooper());

    /* renamed from: A, reason: collision with root package name */
    public int f2102A = 1;

    /* renamed from: B, reason: collision with root package name */
    public int f2103B = 3;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2107F = true;

    @Override // U0.b
    public final void b() {
    }

    @Override // U0.b
    public final void e(int i) {
        f t2;
        if (this.f2107F) {
            j jVar = v().f804b.f2082a;
            g gVar = (g) jVar.f134c;
            g gVar2 = g.f874b;
            if (gVar == gVar2 && (t2 = jVar.t(i, gVar2)) != null) {
                this.f2105D++;
                v().f804b.setInputEnabled(false);
                v().f804b.a(t2.f868a, t2.f869b, gVar2, new V0.b(this, t2, 0));
            }
        }
    }

    @Override // g.AbstractActivityC0110i, a.l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        setContentView(v().f803a);
        this.f2102A = getIntent().getIntExtra("extra_level", 1);
        this.f2103B = bundle != null ? bundle.getInt("key_lives") : 3;
        this.f2104C = bundle != null ? bundle.getInt("key_score") : 0;
        this.f2105D = bundle != null ? bundle.getInt("key_moves") : 0;
        c cVar = U0.d.f864a;
        int i = this.f2102A;
        c cVar2 = U0.d.f864a;
        ListIterator listIterator = cVar2.listIterator(0);
        while (true) {
            Y0.a aVar = (Y0.a) listIterator;
            if (!aVar.hasNext()) {
                obj = null;
                break;
            } else {
                obj = aVar.next();
                if (((e) obj).f865a == i) {
                    break;
                }
            }
        }
        e eVar = (e) obj;
        if (eVar == null) {
            eVar = (e) X0.j.B0(cVar2);
        }
        this.f2106E = new i(eVar.d, eVar.f867c);
        v().f804b.setListener(this);
        v().f806e.setOnClickListener(new ViewOnClickListenerC0025a(3, this));
        y();
        if (bundle == null) {
            v().f804b.c();
        }
    }

    @Override // a.l, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        g1.d.e(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putInt("key_lives", this.f2103B);
        bundle.putInt("key_score", this.f2104C);
        bundle.putInt("key_moves", this.f2105D);
    }

    public final T0.a v() {
        return (T0.a) this.f2108y.a();
    }

    public final void w(f fVar) {
        final int i = 1;
        final int i2 = 2;
        g gVar = g.f874b;
        Handler handler = this.f2109z;
        List list = fVar.f872f;
        g gVar2 = fVar.d;
        if (gVar2 == gVar) {
            this.f2107F = false;
            ConnectFourView connectFourView = v().f804b;
            connectFourView.f2090l = list;
            connectFourView.f2099u = 0.0f;
            Choreographer.getInstance().postFrameCallback(connectFourView.f2100v);
            connectFourView.invalidate();
            c cVar = U0.d.f864a;
            int i3 = this.f2102A * 100;
            int i4 = 42 - this.f2105D;
            int i5 = ((i4 >= 0 ? i4 : 0) * 5) + i3;
            this.f2104C += i5;
            handler.postDelayed(new p(this, i5, 2), 900L);
        } else if (gVar2 == g.f875c) {
            this.f2107F = false;
            ConnectFourView connectFourView2 = v().f804b;
            connectFourView2.f2090l = list;
            connectFourView2.f2099u = 0.0f;
            Choreographer.getInstance().postFrameCallback(connectFourView2.f2100v);
            connectFourView2.invalidate();
            handler.postDelayed(new Runnable(this) { // from class: V0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GameActivity f930b;

                {
                    this.f930b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Integer num;
                    int intValue;
                    int i6;
                    GameActivity gameActivity = this.f930b;
                    switch (r2) {
                        case 0:
                            int i7 = GameActivity.f2101G;
                            gameActivity.x(0, false);
                            return;
                        case 1:
                            int i8 = GameActivity.f2101G;
                            gameActivity.v().f804b.c();
                            gameActivity.v().f804b.setInputEnabled(true);
                            return;
                        default:
                            if (gameActivity.f2107F) {
                                D.j jVar = gameActivity.v().f804b.f2082a;
                                U0.g gVar3 = (U0.g) jVar.f134c;
                                U0.g gVar4 = U0.g.f875c;
                                if (gVar3 != gVar4) {
                                    return;
                                }
                                J.i iVar = gameActivity.f2106E;
                                Integer num2 = null;
                                if (iVar == null) {
                                    g1.d.h("aiPlayer");
                                    throw null;
                                }
                                ArrayList K2 = jVar.K();
                                if (!K2.isEmpty()) {
                                    int ordinal = ((U0.a) iVar.f374b).ordinal();
                                    if (ordinal != 0) {
                                        U0.g gVar5 = U0.g.f874b;
                                        U0.g[][] gVarArr = (U0.g[][]) jVar.f133b;
                                        if (ordinal == 1) {
                                            U0.g[][] gVarArr2 = new U0.g[6][];
                                            for (int i9 = 0; i9 < 6; i9++) {
                                                U0.g[] gVarArr3 = gVarArr[i9];
                                                Object[] copyOf = Arrays.copyOf(gVarArr3, gVarArr3.length);
                                                g1.d.d(copyOf, "copyOf(...)");
                                                gVarArr2[i9] = copyOf;
                                            }
                                            Integer e2 = J.i.e(gVarArr2, gVar4, K2);
                                            if (e2 != null) {
                                                intValue = e2.intValue();
                                            } else {
                                                Integer e3 = J.i.e(gVarArr2, gVar5, K2);
                                                if (e3 != null) {
                                                    intValue = e3.intValue();
                                                } else {
                                                    Iterator it = X0.k.y0(3, 2, 4, 1, 5, 0, 6).iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            int intValue2 = ((Number) it.next()).intValue();
                                                            if (K2.contains(Integer.valueOf(intValue2))) {
                                                                intValue = intValue2;
                                                            }
                                                        } else {
                                                            intValue = ((Number) X0.j.E0(K2, i1.e.f2619a)).intValue();
                                                        }
                                                    }
                                                }
                                            }
                                            num = Integer.valueOf(intValue);
                                        } else {
                                            if (ordinal != 2) {
                                                throw new W0.b();
                                            }
                                            U0.g[][] gVarArr4 = new U0.g[6][];
                                            for (int i10 = 0; i10 < 6; i10++) {
                                                U0.g[] gVarArr5 = gVarArr[i10];
                                                Object[] copyOf2 = Arrays.copyOf(gVarArr5, gVarArr5.length);
                                                g1.d.d(copyOf2, "copyOf(...)");
                                                gVarArr4[i10] = copyOf2;
                                            }
                                            Integer e4 = J.i.e(gVarArr4, gVar4, K2);
                                            if (e4 != null) {
                                                i6 = e4.intValue();
                                            } else {
                                                Integer e5 = J.i.e(gVarArr4, gVar5, K2);
                                                if (e5 != null) {
                                                    i6 = e5.intValue();
                                                } else {
                                                    int intValue3 = ((Number) X0.j.B0(K2)).intValue();
                                                    Iterator it2 = K2.iterator();
                                                    int i11 = Integer.MIN_VALUE;
                                                    while (it2.hasNext()) {
                                                        int intValue4 = ((Number) it2.next()).intValue();
                                                        U0.g[][] c2 = J.i.c(gVarArr4);
                                                        Integer p2 = z1.d.p(c2, intValue4, gVar4);
                                                        if (p2 != null) {
                                                            int i12 = !z1.d.r(c2, p2.intValue(), intValue4, gVar4).isEmpty() ? 100000 : J.i.i(c2, iVar.f373a - 1, false, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                            if (i12 > i11) {
                                                                intValue3 = intValue4;
                                                                i11 = i12;
                                                            }
                                                        }
                                                    }
                                                    i6 = intValue3;
                                                }
                                            }
                                            num = Integer.valueOf(i6);
                                        }
                                    } else {
                                        num = (Integer) X0.j.E0(K2, i1.e.f2619a);
                                    }
                                    num2 = num;
                                }
                                if (num2 == null) {
                                    gameActivity.v().f804b.setInputEnabled(true);
                                    return;
                                }
                                U0.f t2 = jVar.t(num2.intValue(), gVar4);
                                if (t2 == null) {
                                    gameActivity.v().f804b.setInputEnabled(true);
                                    return;
                                } else {
                                    gameActivity.v().f804b.a(t2.f868a, t2.f869b, gVar4, new b(gameActivity, t2, 1));
                                    return;
                                }
                            }
                            return;
                    }
                }
            }, 900L);
        } else if (fVar.f871e) {
            handler.postDelayed(new Runnable(this) { // from class: V0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GameActivity f930b;

                {
                    this.f930b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Integer num;
                    int intValue;
                    int i6;
                    GameActivity gameActivity = this.f930b;
                    switch (i) {
                        case 0:
                            int i7 = GameActivity.f2101G;
                            gameActivity.x(0, false);
                            return;
                        case 1:
                            int i8 = GameActivity.f2101G;
                            gameActivity.v().f804b.c();
                            gameActivity.v().f804b.setInputEnabled(true);
                            return;
                        default:
                            if (gameActivity.f2107F) {
                                D.j jVar = gameActivity.v().f804b.f2082a;
                                U0.g gVar3 = (U0.g) jVar.f134c;
                                U0.g gVar4 = U0.g.f875c;
                                if (gVar3 != gVar4) {
                                    return;
                                }
                                J.i iVar = gameActivity.f2106E;
                                Integer num2 = null;
                                if (iVar == null) {
                                    g1.d.h("aiPlayer");
                                    throw null;
                                }
                                ArrayList K2 = jVar.K();
                                if (!K2.isEmpty()) {
                                    int ordinal = ((U0.a) iVar.f374b).ordinal();
                                    if (ordinal != 0) {
                                        U0.g gVar5 = U0.g.f874b;
                                        U0.g[][] gVarArr = (U0.g[][]) jVar.f133b;
                                        if (ordinal == 1) {
                                            U0.g[][] gVarArr2 = new U0.g[6][];
                                            for (int i9 = 0; i9 < 6; i9++) {
                                                U0.g[] gVarArr3 = gVarArr[i9];
                                                Object[] copyOf = Arrays.copyOf(gVarArr3, gVarArr3.length);
                                                g1.d.d(copyOf, "copyOf(...)");
                                                gVarArr2[i9] = copyOf;
                                            }
                                            Integer e2 = J.i.e(gVarArr2, gVar4, K2);
                                            if (e2 != null) {
                                                intValue = e2.intValue();
                                            } else {
                                                Integer e3 = J.i.e(gVarArr2, gVar5, K2);
                                                if (e3 != null) {
                                                    intValue = e3.intValue();
                                                } else {
                                                    Iterator it = X0.k.y0(3, 2, 4, 1, 5, 0, 6).iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            int intValue2 = ((Number) it.next()).intValue();
                                                            if (K2.contains(Integer.valueOf(intValue2))) {
                                                                intValue = intValue2;
                                                            }
                                                        } else {
                                                            intValue = ((Number) X0.j.E0(K2, i1.e.f2619a)).intValue();
                                                        }
                                                    }
                                                }
                                            }
                                            num = Integer.valueOf(intValue);
                                        } else {
                                            if (ordinal != 2) {
                                                throw new W0.b();
                                            }
                                            U0.g[][] gVarArr4 = new U0.g[6][];
                                            for (int i10 = 0; i10 < 6; i10++) {
                                                U0.g[] gVarArr5 = gVarArr[i10];
                                                Object[] copyOf2 = Arrays.copyOf(gVarArr5, gVarArr5.length);
                                                g1.d.d(copyOf2, "copyOf(...)");
                                                gVarArr4[i10] = copyOf2;
                                            }
                                            Integer e4 = J.i.e(gVarArr4, gVar4, K2);
                                            if (e4 != null) {
                                                i6 = e4.intValue();
                                            } else {
                                                Integer e5 = J.i.e(gVarArr4, gVar5, K2);
                                                if (e5 != null) {
                                                    i6 = e5.intValue();
                                                } else {
                                                    int intValue3 = ((Number) X0.j.B0(K2)).intValue();
                                                    Iterator it2 = K2.iterator();
                                                    int i11 = Integer.MIN_VALUE;
                                                    while (it2.hasNext()) {
                                                        int intValue4 = ((Number) it2.next()).intValue();
                                                        U0.g[][] c2 = J.i.c(gVarArr4);
                                                        Integer p2 = z1.d.p(c2, intValue4, gVar4);
                                                        if (p2 != null) {
                                                            int i12 = !z1.d.r(c2, p2.intValue(), intValue4, gVar4).isEmpty() ? 100000 : J.i.i(c2, iVar.f373a - 1, false, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                            if (i12 > i11) {
                                                                intValue3 = intValue4;
                                                                i11 = i12;
                                                            }
                                                        }
                                                    }
                                                    i6 = intValue3;
                                                }
                                            }
                                            num = Integer.valueOf(i6);
                                        }
                                    } else {
                                        num = (Integer) X0.j.E0(K2, i1.e.f2619a);
                                    }
                                    num2 = num;
                                }
                                if (num2 == null) {
                                    gameActivity.v().f804b.setInputEnabled(true);
                                    return;
                                }
                                U0.f t2 = jVar.t(num2.intValue(), gVar4);
                                if (t2 == null) {
                                    gameActivity.v().f804b.setInputEnabled(true);
                                    return;
                                } else {
                                    gameActivity.v().f804b.a(t2.f868a, t2.f869b, gVar4, new b(gameActivity, t2, 1));
                                    return;
                                }
                            }
                            return;
                    }
                }
            }, 400L);
        } else if (fVar.f870c == gVar) {
            handler.postDelayed(new Runnable(this) { // from class: V0.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GameActivity f930b;

                {
                    this.f930b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    Integer num;
                    int intValue;
                    int i6;
                    GameActivity gameActivity = this.f930b;
                    switch (i2) {
                        case 0:
                            int i7 = GameActivity.f2101G;
                            gameActivity.x(0, false);
                            return;
                        case 1:
                            int i8 = GameActivity.f2101G;
                            gameActivity.v().f804b.c();
                            gameActivity.v().f804b.setInputEnabled(true);
                            return;
                        default:
                            if (gameActivity.f2107F) {
                                D.j jVar = gameActivity.v().f804b.f2082a;
                                U0.g gVar3 = (U0.g) jVar.f134c;
                                U0.g gVar4 = U0.g.f875c;
                                if (gVar3 != gVar4) {
                                    return;
                                }
                                J.i iVar = gameActivity.f2106E;
                                Integer num2 = null;
                                if (iVar == null) {
                                    g1.d.h("aiPlayer");
                                    throw null;
                                }
                                ArrayList K2 = jVar.K();
                                if (!K2.isEmpty()) {
                                    int ordinal = ((U0.a) iVar.f374b).ordinal();
                                    if (ordinal != 0) {
                                        U0.g gVar5 = U0.g.f874b;
                                        U0.g[][] gVarArr = (U0.g[][]) jVar.f133b;
                                        if (ordinal == 1) {
                                            U0.g[][] gVarArr2 = new U0.g[6][];
                                            for (int i9 = 0; i9 < 6; i9++) {
                                                U0.g[] gVarArr3 = gVarArr[i9];
                                                Object[] copyOf = Arrays.copyOf(gVarArr3, gVarArr3.length);
                                                g1.d.d(copyOf, "copyOf(...)");
                                                gVarArr2[i9] = copyOf;
                                            }
                                            Integer e2 = J.i.e(gVarArr2, gVar4, K2);
                                            if (e2 != null) {
                                                intValue = e2.intValue();
                                            } else {
                                                Integer e3 = J.i.e(gVarArr2, gVar5, K2);
                                                if (e3 != null) {
                                                    intValue = e3.intValue();
                                                } else {
                                                    Iterator it = X0.k.y0(3, 2, 4, 1, 5, 0, 6).iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            int intValue2 = ((Number) it.next()).intValue();
                                                            if (K2.contains(Integer.valueOf(intValue2))) {
                                                                intValue = intValue2;
                                                            }
                                                        } else {
                                                            intValue = ((Number) X0.j.E0(K2, i1.e.f2619a)).intValue();
                                                        }
                                                    }
                                                }
                                            }
                                            num = Integer.valueOf(intValue);
                                        } else {
                                            if (ordinal != 2) {
                                                throw new W0.b();
                                            }
                                            U0.g[][] gVarArr4 = new U0.g[6][];
                                            for (int i10 = 0; i10 < 6; i10++) {
                                                U0.g[] gVarArr5 = gVarArr[i10];
                                                Object[] copyOf2 = Arrays.copyOf(gVarArr5, gVarArr5.length);
                                                g1.d.d(copyOf2, "copyOf(...)");
                                                gVarArr4[i10] = copyOf2;
                                            }
                                            Integer e4 = J.i.e(gVarArr4, gVar4, K2);
                                            if (e4 != null) {
                                                i6 = e4.intValue();
                                            } else {
                                                Integer e5 = J.i.e(gVarArr4, gVar5, K2);
                                                if (e5 != null) {
                                                    i6 = e5.intValue();
                                                } else {
                                                    int intValue3 = ((Number) X0.j.B0(K2)).intValue();
                                                    Iterator it2 = K2.iterator();
                                                    int i11 = Integer.MIN_VALUE;
                                                    while (it2.hasNext()) {
                                                        int intValue4 = ((Number) it2.next()).intValue();
                                                        U0.g[][] c2 = J.i.c(gVarArr4);
                                                        Integer p2 = z1.d.p(c2, intValue4, gVar4);
                                                        if (p2 != null) {
                                                            int i12 = !z1.d.r(c2, p2.intValue(), intValue4, gVar4).isEmpty() ? 100000 : J.i.i(c2, iVar.f373a - 1, false, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                            if (i12 > i11) {
                                                                intValue3 = intValue4;
                                                                i11 = i12;
                                                            }
                                                        }
                                                    }
                                                    i6 = intValue3;
                                                }
                                            }
                                            num = Integer.valueOf(i6);
                                        }
                                    } else {
                                        num = (Integer) X0.j.E0(K2, i1.e.f2619a);
                                    }
                                    num2 = num;
                                }
                                if (num2 == null) {
                                    gameActivity.v().f804b.setInputEnabled(true);
                                    return;
                                }
                                U0.f t2 = jVar.t(num2.intValue(), gVar4);
                                if (t2 == null) {
                                    gameActivity.v().f804b.setInputEnabled(true);
                                    return;
                                } else {
                                    gameActivity.v().f804b.a(t2.f868a, t2.f869b, gVar4, new b(gameActivity, t2, 1));
                                    return;
                                }
                            }
                            return;
                    }
                }
            }, 350L);
        } else {
            v().f804b.setInputEnabled(true);
        }
        y();
    }

    public final void x(int i, boolean z2) {
        if (z2) {
            int i2 = this.f2102A;
            Intent putExtra = new Intent(this, (Class<?>) ResultActivity.class).putExtra("extra_level", i2).putExtra("extra_score", this.f2104C).putExtra("extra_earned", i).putExtra("extra_victory", true);
            g1.d.d(putExtra, "putExtra(...)");
            startActivity(putExtra);
            finish();
            return;
        }
        int i3 = this.f2103B - 1;
        this.f2103B = i3;
        if (i3 > 0) {
            this.f2105D = 0;
            this.f2107F = true;
            v().f804b.c();
            v().f804b.setInputEnabled(true);
            y();
            return;
        }
        int i4 = this.f2102A;
        Intent putExtra2 = new Intent(this, (Class<?>) ResultActivity.class).putExtra("extra_level", i4).putExtra("extra_score", this.f2104C).putExtra("extra_earned", 0).putExtra("extra_victory", false);
        g1.d.d(putExtra2, "putExtra(...)");
        startActivity(putExtra2);
        finish();
    }

    public final void y() {
        v().f807f.setText(getString(R.string.score_label, Integer.valueOf(this.f2104C)));
        v().d.setText(getString(R.string.lives_label, Integer.valueOf(this.f2103B)));
        v().f805c.setText(getString(R.string.level_label, Integer.valueOf(this.f2102A)));
    }
}
