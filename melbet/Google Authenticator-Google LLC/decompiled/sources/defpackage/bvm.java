package defpackage;

import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.PersistableBundle;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.editotp.EditOtpActivity;
import com.google.android.libraries.material.opensearchbar.OpenSearchBar;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;
import com.google.android.libraries.material.speeddial.expandable.ExpandableFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvm {
    public static final hkh a = hkh.l("com/google/android/apps/authenticator2/main/OtpListFragmentPeer");
    public final hvl A;
    public final hvl B;
    public final String C;
    public final hel D;
    public final ns E;
    public List F;
    public cab G;
    public List H;
    public List I;
    public List J;
    public di K;
    public cw L;
    public CountDownTimer M;
    public bvj N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public String S;
    public String T;
    public final bww U;
    public final car V;
    public final cad W;
    public final caa X;
    public bry Y;
    public final kt Z;
    public final brn aa;
    public final brn ab;
    public final brn ac;
    public final iwq ad;
    private final ClipboardManager ae;
    private boolean af;
    public final bwi b;
    public final buf c;
    public final frv d;
    public final Context e;
    public final gfy f;
    public final gfy g;
    public final bwo h;
    public final gbi i;
    public final gez j;
    public final gva k;
    public final jey l;
    public final bxa m;
    public final bwx n;
    public final bov o;
    public final gnx p;
    public final buu q = new buu();
    public final buw r = new buw(this);
    public final bve s = new bve();
    public final bvf t = new bvf(this);
    public final bvk u = new bvk(this);
    public final bvl v = new bvl(this);
    public final bvi w = new bvi(this);
    public final bvb x = new bvb(this);
    public final bvh y;
    public final bvg z;

    public bvm(bwi bwiVar, buf bufVar, Context context, frv frvVar, brn brnVar, bvp bvpVar, kt ktVar, ClipboardManager clipboardManager, bwo bwoVar, gbi gbiVar, gez gezVar, iwq iwqVar, gva gvaVar, brn brnVar2, jey jeyVar, bww bwwVar, bxa bxaVar, bwx bwxVar, car carVar, caa caaVar, cad cadVar, bov bovVar, gnx gnxVar, brn brnVar3, hvl hvlVar, hvl hvlVar2) {
        this.b = bwiVar;
        this.e = context;
        this.d = frvVar;
        this.c = bufVar;
        this.aa = brnVar;
        this.Z = ktVar;
        this.ae = clipboardManager;
        this.h = bwoVar;
        this.i = gbiVar;
        this.j = gezVar;
        this.ad = iwqVar;
        this.l = jeyVar;
        this.U = bwwVar;
        this.m = bxaVar;
        this.n = bwxVar;
        this.V = carVar;
        this.X = caaVar;
        this.W = cadVar;
        this.o = bovVar;
        this.k = gvaVar;
        this.ab = brnVar2;
        this.p = gnxVar;
        this.ac = brnVar3;
        this.B = hvlVar2;
        this.A = hvlVar;
        this.E = new bun(bufVar);
        this.D = hel.r(new buy(R.string.enter_a_setup_key, R.drawable.gs_keyboard_alt_vd_theme_48, R.id.fab_enter_a_key, new btl(frvVar)), new buy(R.string.scan_a_qr_code, R.drawable.gs_photo_camera_vd_theme_48, R.id.fab_scan_a_qr_code, new btm(frvVar)));
        hhs hhsVar = new hhs(null);
        hhsVar.d(bvpVar);
        this.f = hhsVar.c();
        hhs hhsVar2 = new hhs(null);
        hhsVar2.d(bvpVar);
        this.g = hhsVar2.c();
        this.N = bvj.IN_PROGRESS;
        this.C = cch.a(context);
        this.P = false;
        this.af = false;
        this.y = new bvh(this);
        this.z = new bvg(this);
    }

    public static RecyclerView a(buf bufVar) {
        return (RecyclerView) bufVar.J().findViewById(R.id.filtered_otp_recycler_view);
    }

    public static RecyclerView b(buf bufVar) {
        return (RecyclerView) bufVar.J().findViewById(R.id.otp_recycler_view);
    }

    public static View c(buf bufVar) {
        return bufVar.J().findViewById(R.id.scrim);
    }

    public static DrawerLayout d(buf bufVar) {
        return (DrawerLayout) bufVar.J().findViewById(R.id.drawer_layout);
    }

    public static SwipeRefreshLayout e(buf bufVar) {
        return (SwipeRefreshLayout) bufVar.J().findViewById(R.id.swipe_refresh);
    }

    public static OpenSearchBar f(buf bufVar) {
        return (OpenSearchBar) bufVar.J().findViewById(R.id.open_search_bar);
    }

    public static OpenSearchView g(buf bufVar) {
        return (OpenSearchView) bufVar.J().findViewById(R.id.open_search_view);
    }

    public static FloatingSpeedDialView h(buf bufVar) {
        return (FloatingSpeedDialView) bufVar.J().findViewById(R.id.floating_speed_dial_view);
    }

    public static ExpandableFloatingActionButton i(buf bufVar) {
        return (ExpandableFloatingActionButton) bufVar.J().findViewById(R.id.expandable_fab);
    }

    private static RelativeLayout t(buf bufVar) {
        return (RelativeLayout) bufVar.J().findViewById(R.id.no_otps_view);
    }

    public final void j() {
        this.O = false;
        i(this.c).d(false);
        bry bryVar = this.Y;
        FloatingActionButton floatingActionButton = (FloatingActionButton) bryVar.a;
        dms a2 = dms.a(floatingActionButton);
        if (a2.a == 2) {
            int i = a2.b;
            if (i == 1) {
                fhg fhgVar = (fhg) a2.d;
                dmm dmmVar = new dmm(new dmq(floatingActionButton), fhgVar, a2.e, null);
                dmmVar.h();
                dmmVar.e(dmx.a);
                Interpolator interpolator = dmk.a;
                dmmVar.i();
                dmmVar.f();
                View view = dmmVar.c;
                if (view != null) {
                    dmmVar.a(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f), 0L, 150L);
                }
                dmmVar.g();
                bryVar.c(dmmVar, 1, fhgVar, a2.e);
                return;
            }
            if (i == 2) {
                dmv.a(floatingActionButton, (FloatingSpeedDialView) a2.d, a2.e, false);
                a2.b = 2;
                a2.a = 1;
                a2.d = null;
                a2.e = null;
                return;
            }
            if (i != 3) {
                throw new IllegalStateException(a.Y(i, "Can't collapse from type "));
            }
            fhg fhgVar2 = (fhg) a2.d;
            dmm dmmVar2 = new dmm(new dmq(floatingActionButton), fhgVar2, a2.e, null);
            dmmVar2.h();
            dmmVar2.e(dmx.b);
            Interpolator interpolator2 = dmk.a;
            dmmVar2.i();
            dmmVar2.f();
            dmmVar2.a(ObjectAnimator.ofFloat((ViewGroup) dmmVar2.b, (Property<ViewGroup, Float>) dmp.a, 0.0f), 0L, 255L);
            dmmVar2.g();
            bryVar.c(dmmVar2, 3, fhgVar2, a2.e);
        }
    }

    public final void k(String str) {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 0) {
            str = String.valueOf(str.substring(str.length() >> 1)).concat(String.valueOf(str.substring(0, str.length() >> 1)));
        }
        buf bufVar = this.c;
        ClipData newPlainText = ClipData.newPlainText(bufVar.R(R.string.clipboard_label), str);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
        newPlainText.getDescription().setExtras(persistableBundle);
        this.ae.setPrimaryClip(newPlainText);
        q(bufVar.bs().getString(R.string.copied_to_clipboard_toast));
    }

    public final void l() {
        this.O = true;
        buf bufVar = this.c;
        i(bufVar).d(true);
        bry bryVar = this.Y;
        FloatingSpeedDialView h = h(bufVar);
        View c = c(bufVar);
        FloatingActionButton floatingActionButton = (FloatingActionButton) bryVar.a;
        dms a2 = dms.a(floatingActionButton);
        int i = a2.a;
        if (i == 0 || i == 1) {
            int i2 = a2.b;
            if (i2 == 0 || i2 == 2) {
                dmv.a(floatingActionButton, h, c, true);
                a2.b = 2;
                a2.a = 2;
                a2.d = h;
                a2.e = c;
            }
        }
    }

    public final void m(String str) {
        Intent intent = new Intent(this.K, (Class<?>) EditOtpActivity.class);
        intent.putExtra("editOtpUniqueId", str);
        ftc.a(intent, this.d);
        gtt f = this.k.f("openingEditActivity", 31);
        try {
            hoq.am(this.c, intent);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void n() {
        this.c.E().invalidateOptionsMenu();
    }

    public final void o(hel helVar) {
        this.F = new ArrayList(helVar);
        this.H = new ArrayList(helVar.size());
        if (true == helVar.isEmpty()) {
            buf bufVar = this.c;
            t(bufVar).setVisibility(0);
            b(bufVar).setVisibility(8);
            return;
        }
        if (!this.af) {
            this.J = new ArrayList();
            buf bufVar2 = this.c;
            g(bufVar2).k.addTextChangedListener(new guz(this.k, new brf(this, 3)));
            if (this.T != null) {
                g(bufVar2).k.setText("");
                g(bufVar2).k.setText(this.T);
                g(bufVar2).k.setSelection(this.T.length());
                this.T = null;
            }
            this.af = true;
        }
        buf bufVar3 = this.c;
        t(bufVar3).setVisibility(8);
        b(bufVar3).setVisibility(0);
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            this.H.add(btw.a((bpc) it.next(), false));
        }
        this.f.t(this.H);
        this.M = new buo(this).start();
    }

    public final void p(btw btwVar) {
        Spanned fromHtml;
        fhm fhmVar = new fhm(this.e, R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog_Centered);
        Object[] objArr = {btwVar.a};
        buf bufVar = this.c;
        fhmVar.t(bufVar.S(R.string.remove_account_dialog_title, objArr));
        fromHtml = Html.fromHtml(bufVar.bs().getString(R.string.remove_account_dialog_message), 1);
        fhmVar.m(fromHtml);
        fhmVar.q(R.string.remove_account_positive_button, new bum(this, btwVar, 1));
        fhmVar.o(bufVar.R(R.string.remove_account_negative_button), new bul(1));
        fhmVar.p(new buh());
        fhmVar.j(R.drawable.warning_error_color);
        fhmVar.i();
        this.P = true;
        this.S = btwVar.d;
    }

    public final void q(CharSequence charSequence) {
        buf bufVar = this.c;
        fpm n = fpm.n(bufVar.J(), charSequence, -1);
        n.l(i(bufVar));
        n.g();
    }

    public final void r() {
        for (int i = 0; i < this.H.size(); i++) {
            if (!((btw) this.H.get(i)).c) {
                List list = this.H;
                list.set(i, btw.a(((btw) list.get(i)).f, false));
            }
        }
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            if (!((btw) this.J.get(i2)).c) {
                List list2 = this.J;
                list2.set(i2, btw.a(((btw) list2.get(i2)).f, false));
            }
        }
        this.f.e();
        this.g.e();
    }

    public final void s(int i) {
        jkj k = hqs.a.k();
        if (!k.b.M()) {
            k.t();
        }
        hqs hqsVar = (hqs) k.b;
        bov bovVar = this.o;
        hqsVar.c = i - 1;
        hqsVar.b |= 1;
        bovVar.a((hqs) k.q());
    }
}
