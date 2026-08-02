package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.SimpleAvatarView;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.TextViewContainer;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dxi implements hac {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dxi(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r0v97, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r1v55, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v78, types: [guq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, koe] */
    @Override // defpackage.hac
    public final Object bB() {
        switch (this.c) {
            case 0:
                Object obj = this.b;
                obj.getClass();
                return ((dja) ((ekx) this.a).d).w((ViewGroup) obj);
            case 1:
                return new crv((Context) this.b, (crh) this.a);
            case 2:
                Object obj2 = ((cfe) ((ekx) this.a).c).a;
                ViewGroup viewGroup = (ViewGroup) this.b;
                dzv G = ((fwm) obj2).G(viewGroup);
                viewGroup.addView(G.t);
                return new cfe(G);
            case 3:
                ViewGroup viewGroup2 = (ViewGroup) this.b;
                LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.og_bento_selected_account, viewGroup2);
                Button button = (Button) viewGroup2.findViewById(R.id.og_bento_manage_your_google_account);
                TextViewContainer textViewContainer = (TextViewContainer) viewGroup2.findViewById(R.id.og_bento_manage_your_google_account_container);
                button.getClass();
                edb a = textViewContainer.a(button);
                TextView textView = (TextView) viewGroup2.findViewById(R.id.og_bento_selected_account_greeting_message);
                TextViewContainer textViewContainer2 = (TextViewContainer) viewGroup2.findViewById(R.id.og_bento_selected_account_greeting_message_container);
                textView.getClass();
                edb a2 = textViewContainer2.a(textView);
                FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(R.id.og_bento_selected_account_avatar);
                frameLayout.getClass();
                return new ldt(((fwm) ((cbp) ((dya) this.a).b).a).H(frameLayout), frameLayout, a2, button, a);
            case 4:
                ViewGroup viewGroup3 = (ViewGroup) this.b;
                View inflate = LayoutInflater.from(viewGroup3.getContext()).inflate(R.layout.og_bento_product_space, viewGroup3);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.og_bento_product_space_card_stacks);
                fwm fwmVar = (fwm) ((dya) this.a).e;
                Object b = fwmVar.b.b();
                recyclerView.X((kr) b);
                kv kvVar = recyclerView.C;
                if (true != (kvVar instanceof kv)) {
                    kvVar = null;
                }
                if (kvVar != null) {
                    kvVar.j();
                }
                TextView textView2 = (TextView) inflate.findViewById(R.id.og_bento_product_space_title);
                if (((bst) fwmVar.a).h()) {
                    textView2.getClass();
                    textView2.setVisibility(8);
                    recyclerView.getClass();
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, 0);
                    recyclerView.setLayoutParams(marginLayoutParams);
                }
                textView2.getClass();
                return new fwm(textView2, b, (short[]) null);
            case 5:
                Object obj3 = this.b;
                obj3.getClass();
                dze H = ((fwm) ((fwm) this.a).a).H((ViewGroup) obj3);
                ((SimpleAvatarView) H.a).setId(R.id.og_bento_card_avatar_image);
                return H;
            case 6:
                return ((dja) ((fwm) this.a).b).w((ViewGroup) this.b);
            case 7:
                ViewGroup viewGroup4 = (ViewGroup) this.b;
                View inflate2 = LayoutInflater.from(viewGroup4.getContext()).inflate(R.layout.og_bento_trailing_pair_content, viewGroup4, false);
                inflate2.getClass();
                ViewGroup viewGroup5 = (ViewGroup) inflate2;
                viewGroup4.addView(viewGroup5);
                ViewGroup viewGroup6 = (ViewGroup) viewGroup5.findViewById(R.id.og_bento_card_trailing_pair_first_container);
                ViewGroup viewGroup7 = (ViewGroup) viewGroup5.findViewById(R.id.og_bento_card_trailing_pair_second_container);
                viewGroup6.getClass();
                dja djaVar = (dja) this.a;
                eaq w = djaVar.w(viewGroup6);
                viewGroup7.getClass();
                return new ekx(viewGroup5, viewGroup6, w, djaVar.w(viewGroup7));
            case 8:
                Object obj4 = this.b;
                return new efn(this.a, new iyi(new cji((Context) obj4, "STREAMZ_ONEGOOGLE_ANDROID", null), "STREAMZ_ONEGOOGLE_ANDROID"), obj4 instanceof Application ? (Application) obj4 : null);
            case 9:
                egd egdVar = (egd) this.a;
                Context applicationContext = egdVar.a.getApplicationContext();
                ExecutorService executorService = egdVar.b;
                efx efxVar = egdVar.f;
                if (efxVar == null) {
                    efxVar = new efy(egdVar.a, egdVar.b);
                }
                Object obj5 = this.b;
                applicationContext.getClass();
                executorService.getClass();
                fso fsoVar = new fso(null);
                fsoVar.a = 641;
                cyq cyqVar = new cyq(fsoVar);
                bxm bxmVar = cyr.a;
                cmr cmrVar = cmr.a;
                return new ehe(new egy(applicationContext, new cms(applicationContext, null, bxmVar, cyqVar, cmrVar), new cyn(applicationContext, cyqVar), new cms(applicationContext, null, bxmVar, cyqVar, cmrVar), efxVar, executorService, cll.a), 2, (fwm) obj5, applicationContext.getPackageName(), 0);
            case 10:
                Object obj6 = this.b;
                synchronized (this.a) {
                    String b2 = elh.b();
                    String str = b2 + ".trace";
                    File file = new File(((Context) obj6).getFilesDir(), a.ah(b2, "primes_profiling_"));
                    if (!file.exists() && !file.mkdir()) {
                        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "<init>", 117, "CpuProfilingService.java")).s("Could not create directory");
                        return gyf.a;
                    }
                    File file2 = new File(file, str);
                    file2.deleteOnExit();
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (RuntimeException e) {
                        ((hkf) ((hkf) ((hkf) eiu.a.b()).h(e)).i("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", (char) 368, "CpuProfilingService.java")).s("Exception when clearing trace file.");
                    }
                    return gzp.h(file2);
                }
            case 11:
                return ((bry) this.b).f(((eqw) this.a.b()).a);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return (etp) ((gzp) this.a.bB()).c(etd.c((Context) ((hwm) this.b).f));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((hpx) ((iyi) this.b).b).g(((jjq) this.a).x());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                cjf cjfVar = (cjf) this.b;
                String str2 = cjfVar.h;
                String str3 = cjfVar.g;
                return ldt.l(str3, (AtomicReference) ((ldt) ((bry) this.a).a).a.get(new gzq(str2, str3)));
            case 15:
                return ldt.l("", (AtomicReference) ((ldt) ((bry) this.a).a).b.get(((cjf) this.b).h));
            case 16:
                return String.valueOf(etb.b((Context) this.b)) + File.separator + "phenotype_storage_info" + File.separator + "shared" + File.separator + ((String) this.a);
            case 17:
                Object obj7 = this.a;
                try {
                    return Integer.valueOf(((PackageManager) ((ifn) this.b).a).getPackageInfo((String) obj7, 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("PhenotypeResourceReader", "Failed to find version of package ".concat(String.valueOf(obj7)));
                    return null;
                }
            case 18:
                return ((LayoutInflater) this.b).cloneInContext((Context) this.a);
            case 19:
                ?? r1 = this.b;
                long j = gvx.a;
                guq g = gta.g(gta.a(), r1);
                try {
                    return this.a.bB();
                } finally {
                }
            default:
                int i = igs.d;
                return new ert((erx) this.a, new eqn(this.b, 19));
        }
    }

    public /* synthetic */ dxi(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
