package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.main.MainActivity;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;
import com.google.android.libraries.material.speeddial.expandable.ExpandableFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class buf extends bwk implements gjg, gxy {
    private final brn aj = new brn((byte[]) null, (short[]) null);
    private bvm d;
    private Context e;
    private boolean f;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0364 A[Catch: all -> 0x03b5, TryCatch #0 {all -> 0x03b5, blocks: (B:3:0x0009, B:5:0x0082, B:7:0x0086, B:8:0x0358, B:10:0x0364, B:11:0x037b, B:13:0x0380, B:15:0x03aa, B:23:0x0140, B:25:0x0145, B:26:0x0255, B:29:0x025e, B:31:0x026e, B:32:0x0271, B:34:0x0286, B:35:0x0289, B:36:0x02a1, B:38:0x02a6, B:39:0x0320), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0380 A[Catch: all -> 0x03b5, TryCatch #0 {all -> 0x03b5, blocks: (B:3:0x0009, B:5:0x0082, B:7:0x0086, B:8:0x0358, B:10:0x0364, B:11:0x037b, B:13:0x0380, B:15:0x03aa, B:23:0x0140, B:25:0x0145, B:26:0x0255, B:29:0x025e, B:31:0x026e, B:32:0x0271, B:34:0x0286, B:35:0x0289, B:36:0x02a1, B:38:0x02a6, B:39:0x0320), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03aa A[Catch: all -> 0x03b5, TRY_LEAVE, TryCatch #0 {all -> 0x03b5, blocks: (B:3:0x0009, B:5:0x0082, B:7:0x0086, B:8:0x0358, B:10:0x0364, B:11:0x037b, B:13:0x0380, B:15:0x03aa, B:23:0x0140, B:25:0x0145, B:26:0x0255, B:29:0x025e, B:31:0x026e, B:32:0x0271, B:34:0x0286, B:35:0x0289, B:36:0x02a1, B:38:0x02a6, B:39:0x0320), top: B:2:0x0009 }] */
    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.i();
        try {
            aQ(layoutInflater, viewGroup, bundle);
            bvm z = z();
            int i = 0;
            View inflate = layoutInflater.inflate(R.layout.main_fragment, viewGroup, false);
            buf bufVar = z.c;
            z.K = (di) bufVar.E();
            z.K.k((Toolbar) inflate.findViewById(R.id.open_search_bar));
            z.K.h().t();
            z.K.h().v();
            ((fyo) bufVar.F().d("accountParticleDiscTag")).z().b((OpenSearchBar) inflate.findViewById(R.id.open_search_bar));
            OpenSearchBar openSearchBar = (OpenSearchBar) inflate.findViewById(R.id.open_search_bar);
            openSearchBar.post(new evp(openSearchBar, 16));
            bufVar.aw();
            bwi bwiVar = z.b;
            int i2 = bwiVar.d;
            int i3 = 12;
            int i4 = 9;
            int i5 = 6;
            int i6 = 10;
            int i7 = 1;
            int i8 = 2;
            if (i2 == 3) {
                if (bwiVar.c == 2) {
                    gez gezVar = z.j;
                    bww bwwVar = z.U;
                    hvi e = bwwVar.i.e(bwwVar.d.a(), geh.FEW_SECONDS);
                    bwv bwvVar = new bwv(i);
                    hvl hvlVar = bwwVar.f;
                    hvi at = hoq.at(e, bwvVar, hvlVar);
                    hvi at2 = hoq.at(at, new bpf(bwwVar, i3), hvlVar);
                    hvi au = hoq.au(at2, new bwu(i8), hvlVar);
                    hvi at3 = hoq.at(au, new bqh(i4), hvlVar);
                    hvi au2 = hoq.au(at3, new bpg(bwwVar, at3, i6), hvlVar);
                    hvi au3 = hoq.au(au2, new bpn(bwwVar, i5), hvlVar);
                    hvi t = hoq.aV(au3).t(new cbc(bwwVar.g, i7), hvlVar);
                    hvi t2 = hoq.aX(au2, at2).t(new bwr(at2, au, i7), hvlVar);
                    gezVar.g(R.id.move_otps_to_online_state, new btf(hoq.aV(t, t2, hoq.aX(at, t2).t(new bwr(bwwVar, at, i), hvlVar)).s(new bsp(t, au3, 3), hvlVar), 2), new buz(z, 3));
                    if (jsh.a.bB().a()) {
                        z.j.g(R.id.observe_staged_migration_data, new btf(z.X, 8), new buz(z, 4));
                    }
                    z.O = false;
                    if (bundle != null) {
                        z.O = bundle.getBoolean("addOtpFabExpanded");
                        z.P = bundle.getBoolean("deleteOtpDialogShown", false);
                        z.R = bundle.getBoolean("stagedImportDialogSnoozed", false);
                        z.S = bundle.getString("deleteOtpUniqueId");
                        z.T = bundle.getString("searchQuery");
                    }
                    if (inflate == null) {
                        e.k(this, z());
                    }
                    gta.o();
                    return inflate;
                }
                i2 = 3;
            }
            int i9 = 5;
            if (i2 == 2 && bwiVar.c == 3) {
                gez gezVar2 = z.j;
                bww bwwVar2 = z.U;
                hvi a = bwwVar2.e.a();
                bqh bqhVar = new bqh(14);
                hvl hvlVar2 = bwwVar2.f;
                hvi at4 = hoq.at(a, bqhVar, hvlVar2);
                gwu h = gwu.g(at4).h(new bpf(bwwVar2, 8), hvlVar2);
                hvi au4 = hoq.au(h, new bwu(0), hvlVar2);
                hvi au5 = hoq.au(hoq.at(hoq.at(au4, new bqh(17), hvlVar2), new bpf(bwwVar2, i4), hvlVar2), new bpn(bwwVar2.g, i4), hvlVar2);
                hvi s = hoq.aX(h, au4, au5, hoq.aX(at4, au5).t(new bwr(bwwVar2, at4, 2), hvlVar2)).s(new bsp(h, au4, i9), hvlVar2);
                hvi s2 = hoq.aX(gwu.g(s).h(new bqh(18), hvlVar2).i(new bpn(bwwVar2, i6), hvlVar2), gwu.g(s).h(new bqh(15), hvlVar2).i(new bpn(bwwVar2, 7), hvlVar2)).s(new bws(2), hvlVar2);
                gwu i10 = gwu.g(s2).d(Exception.class, new bqh(16), hvlVar2).i(new bpn(bwwVar2, 8), hvlVar2);
                gezVar2.g(R.id.move_otps_to_offline_state, new btf(hoq.aV(s2, i10).s(new bsp(i10, s2, 4), hvlVar2), 4), new buz(z, 2));
            } else {
                if (bwiVar.c == 3 && i2 == 3) {
                    bov bovVar = z.o;
                    jkj k = hqs.a.k();
                    if (!k.b.M()) {
                        k.t();
                    }
                    jkp jkpVar = k.b;
                    hqs hqsVar = (hqs) jkpVar;
                    hqsVar.c = 10;
                    hqsVar.b |= 1;
                    String str = z.C;
                    if (!jkpVar.M()) {
                        k.t();
                    }
                    hqs hqsVar2 = (hqs) k.b;
                    str.getClass();
                    hqsVar2.b |= 64;
                    hqsVar2.g = str;
                    bovVar.a((hqs) k.q());
                }
                if (bwiVar.d == 3) {
                    gez gezVar3 = z.j;
                    bww bwwVar3 = z.U;
                    hvi e2 = bwwVar3.i.e(bwwVar3.d.a(), geh.FEW_SECONDS);
                    bqh bqhVar2 = new bqh(i3);
                    hvl hvlVar3 = bwwVar3.f;
                    hvi at5 = hoq.at(hoq.at(e2, bqhVar2, hvlVar3), new bpf(bwwVar3, 7), hvlVar3);
                    hvi au6 = hoq.au(at5, new bwu(2), hvlVar3);
                    hvi at6 = hoq.at(au6, new bwv(i7), hvlVar3);
                    int i11 = 11;
                    hvi au7 = hoq.au(at6, new bpg(bwwVar3, at6, i11), hvlVar3);
                    gezVar3.g(R.id.move_otps_to_online_state_on_fragment_start, new btf(hoq.au(hoq.aX(au7, at5).t(new bwr(at5, au6, 3), hvlVar3), new bpn(au7, i11), hvlVar3), 3), new bva());
                }
                gez gezVar4 = z.j;
                gezVar4.g(R.id.read_otps_from_local_db, new btf(z.m, 7), new buz(z, 0));
                bwx bwxVar = z.n;
                gezVar4.g(R.id.sync_otps, new btf(bwxVar, 5), new buz(z, 6));
                gezVar4.g(R.id.update_syncing_icon, new btf(bwxVar, 6), new buz(z, 5));
            }
            if (jsh.a.bB().a()) {
            }
            z.O = false;
            if (bundle != null) {
            }
            if (inflate == null) {
            }
            gta.o();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.bwk, defpackage.faa, defpackage.bd
    public final void X(Activity activity) {
        this.b.i();
        try {
            super.X(activity);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.faa, defpackage.bd
    public final void Y(Menu menu, MenuInflater menuInflater) {
        super.Y(menu, menuInflater);
        z();
        menuInflater.inflate(R.menu.syncing_menu, menu);
    }

    @Override // defpackage.gjg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvm z() {
        bvm bvmVar = this.d;
        if (bvmVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.f) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return bvmVar;
    }

    @Override // defpackage.faa, defpackage.bd
    public final void ab(Menu menu) {
        super.ab(menu);
        final bvm z = z();
        MenuItem findItem = menu.findItem(R.id.sync_status);
        bvj bvjVar = z.N;
        bvj bvjVar2 = bvj.DISABLED;
        findItem.setIcon(bvjVar.f);
        findItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: buk
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                bvm bvmVar = bvm.this;
                Resources bs = bvmVar.c.bs();
                bvj bvjVar3 = bvmVar.N;
                bvj bvjVar4 = bvj.DISABLED;
                bvmVar.q(bs.getString(bvjVar3.e));
                return true;
            }
        });
        buf bufVar = z.c;
        ((fyo) bufVar.F().d("accountParticleDiscTag")).z().b(bvm.f(bufVar));
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void ac() {
        gut c = this.b.c();
        try {
            aN();
            bvm z = z();
            CountDownTimer countDownTimer = z.M;
            if (countDownTimer != null) {
                countDownTimer.start();
                z.r();
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void ad(View view, Bundle bundle) {
        this.b.i();
        try {
            hoq.ad(this);
            z();
            e.k(this, z());
            aP(view, bundle);
            bvm z = z();
            buf bufVar = z.c;
            bvm.e(bufVar).i(true, false);
            z.Y = new bry((FloatingActionButton) bvm.i(bufVar));
            ExpandableFloatingActionButton i = bvm.i(bufVar);
            bur burVar = new bur();
            brn brnVar = z.aa;
            brnVar.r(i, burVar);
            brnVar.r(bvm.c(bufVar), new bvd());
            Context context = z.e;
            bvm.h(bufVar).a.X(new dnl(z, context));
            bvm.b(bufVar).Y(new LinearLayoutManager(1));
            bvm.b(bufVar).X(z.f);
            jj jjVar = new jj(context);
            jjVar.a(context.getDrawable(R.drawable.recycler_view_divider));
            bvm.b(bufVar).av(jjVar);
            mw mwVar = new mw(new bvc(z));
            RecyclerView b = bvm.b(bufVar);
            RecyclerView recyclerView = mwVar.p;
            if (recyclerView != b) {
                if (recyclerView != null) {
                    recyclerView.au(mwVar);
                    mwVar.p.T(mwVar.x);
                    List list = mwVar.p.v;
                    if (list != null) {
                        list.remove(mwVar);
                    }
                    List list2 = mwVar.n;
                    int size = list2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        mv mvVar = (mv) list2.get(0);
                        mvVar.a();
                        ms.d(mvVar.h);
                    }
                    list2.clear();
                    mwVar.u = null;
                    mwVar.i();
                    mt mtVar = mwVar.w;
                    if (mtVar != null) {
                        mtVar.a = false;
                        mwVar.w = null;
                    }
                    if (mwVar.v != null) {
                        mwVar.v = null;
                    }
                }
                mwVar.p = b;
                if (b != null) {
                    Resources resources = b.getResources();
                    mwVar.e = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                    mwVar.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                    mwVar.o = ViewConfiguration.get(mwVar.p.getContext()).getScaledTouchSlop();
                    mwVar.p.av(mwVar);
                    mwVar.p.s(mwVar.x);
                    mwVar.p.r(mwVar);
                    mwVar.w = new mt(mwVar);
                    mwVar.v = new GestureDetector(mwVar.p.getContext(), mwVar.w);
                }
            }
            bvm.a(bufVar).Y(new LinearLayoutManager(1));
            bvm.a(bufVar).X(z.g);
            jj jjVar2 = new jj(context);
            jjVar2.a(context.getDrawable(R.drawable.recycler_view_divider));
            bvm.a(bufVar).av(jjVar2);
            bvm.e(bufVar).a = new gxd(z.ab, new bui(z));
            new Intent(context, (Class<?>) MainActivity.class).setAction("scanQrCodeAction");
            hy$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(hy$$ExternalSyntheticApiModelOutline0.m())).disableShortcuts(hel.q("id1"), bufVar.R(R.string.disabled_shortcut));
            z.L = new cw(z.K, bvm.f(bufVar), bvm.d(bufVar));
            bvm.d(bufVar).h(z.L);
            bvm.d(bufVar).h(new bup(z));
            ((NavigationView) bufVar.J().findViewById(R.id.nav_view)).h = new gxa(z.ac, new buj(z));
            z.K.f().b(bufVar, z.E);
            if (z.O) {
                z.l();
            }
            brnVar.r((Button) bufVar.J().findViewById(R.id.add_a_code_button), new btk(z.d));
            View J = bufVar.J();
            boh bohVar = new boh(6);
            int i2 = yq.a;
            yi.c(J, bohVar);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd
    public final void ah(Bundle bundle) {
        Bundle bundle2 = this.n;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        hoq.I(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.ah(bundle);
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final boolean as(MenuItem menuItem) {
        gut a = this.b.a("Fragment:onOptionsItemSelected");
        try {
            aR(menuItem);
            cw cwVar = z().L;
            if (menuItem.getItemId() == 16908332) {
                boolean z = cwVar.a;
                cwVar.e();
            }
            a.close();
            return true;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bd
    public final LayoutInflater bv(Bundle bundle) {
        this.b.i();
        try {
            LayoutInflater at = at();
            LayoutInflater cloneInContext = at.cloneInContext(new gmq(at, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new glx(this, cloneInContext));
            gta.o();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.bwk
    protected final /* bridge */ /* synthetic */ gmk d() {
        return new gma(this);
    }

    @Override // defpackage.bwk, defpackage.glo, defpackage.bd
    public final void e(Context context) {
        this.b.i();
        try {
            if (this.f) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.e(context);
            if (this.d == null) {
                bvo bvoVar = (bvo) hnu.bh(this, bvo.class);
                gty aA = hoq.aA(27, buf.class, "CreatePeer");
                try {
                    this.d = bvoVar.e();
                    aA.close();
                } finally {
                }
            }
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void f(Bundle bundle) {
        this.b.i();
        try {
            aG(bundle);
            bvm z = z();
            buf bufVar = z.c;
            if (bufVar.F().d("accountParticleDiscTag") == null) {
                ae aeVar = new ae(bufVar.F());
                frv frvVar = z.d;
                fyo fyoVar = new fyo();
                jqq.g(fyoVar);
                gmk.d(fyoVar, frvVar);
                aeVar.d(0, fyoVar, "accountParticleDiscTag", 1);
                aeVar.c();
            }
            gbi gbiVar = z.i;
            gbiVar.h(z.q);
            gbiVar.h(z.r);
            gbiVar.h(z.s);
            gbiVar.h(z.t);
            gbiVar.h(z.u);
            gbiVar.h(z.v);
            gbiVar.h(z.w);
            gbiVar.h(z.x);
            gbiVar.h(z.y);
            gbiVar.h(z.z);
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void g() {
        gut c = this.b.c();
        try {
            aL();
            if (this.R == null) {
                this.aj.q();
            }
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.faa, defpackage.bd
    public final void h() {
        gut b = this.b.b();
        try {
            aM();
            this.f = true;
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.glo, defpackage.faa, defpackage.bd
    public final void i(Bundle bundle) {
        this.b.i();
        try {
            aO(bundle);
            bvm z = z();
            bundle.putBoolean("addOtpFabExpanded", z.O);
            bundle.putBoolean("deleteOtpDialogShown", z.P);
            bundle.putBoolean("stagedImportDialogSnoozed", z.R);
            bundle.putString("deleteOtpUniqueId", z.S);
            bundle.putString("searchQuery", bvm.g(z.c).k.getText().toString());
            gta.o();
        } catch (Throwable th) {
            try {
                gta.o();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.gxy
    public final gxv n(gxq gxqVar) {
        return this.aj.o(gxqVar);
    }

    @Override // defpackage.gxy
    public final void o(Class cls, gxu gxuVar) {
        this.aj.p(cls, gxuVar);
    }

    @Override // defpackage.bwk, defpackage.bd
    public final Context x() {
        if (super.x() == null) {
            return null;
        }
        if (this.e == null) {
            this.e = new glx(this, super.x());
        }
        return this.e;
    }
}
