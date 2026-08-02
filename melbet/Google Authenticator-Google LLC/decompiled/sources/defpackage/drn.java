package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class drn implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ drn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v37, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [edj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v45, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r6v7, types: [afd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [afd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor editor = null;
        switch (this.c) {
            case 0:
                SelectedAccountDisc selectedAccountDisc = ((drp) this.a).b;
                selectedAccountDisc.setContentDescription(this.b);
                int i = yq.a;
                selectedAccountDisc.setImportantForAccessibility(1);
                return;
            case 1:
                dri driVar = ((drg) this.a).a;
                driVar.f = this.b;
                driVar.t();
                return;
            case 2:
                Object a = ((dsg) this.b).a();
                drp drpVar = (drp) this.a;
                drpVar.b.b.h(a);
                drpVar.b();
                return;
            case 3:
                this.b.a(((dtw) this.a).aG().a().a());
                return;
            case 4:
                fao.c();
                ((aez) ((eas) this.b).a.b).e(this.a);
                return;
            case 5:
                fao.c();
                ((aez) ((eas) this.b).a.b).h(this.a);
                return;
            case 6:
                ((eby) this.a).m();
                return;
            case 7:
                eea eeaVar = ((ExpressSignInLayout) this.b).a;
                eeaVar.getClass();
                this.a.a(eeaVar);
                return;
            case 8:
                eea eeaVar2 = ((edw) this.a).a;
                eeaVar2.m(eeaVar2.e.a.g(), this.b);
                return;
            case 9:
                eea eeaVar3 = ((edw) this.a).a;
                eeaVar3.m((hel) this.b, eeaVar3.e.a.a());
                return;
            case 10:
                this.b.run();
                ((efg) this.a).a = false;
                return;
            case 11:
                ((fea) ((efn) ((fwm) this.a).b.bB()).b.bB()).b(this.b);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((egc) ((AtomicReference) ((ehe) this.b).b).get()).f((ehn) this.a);
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ehe eheVar = (ehe) this.a;
                ((AtomicReference) eheVar.b).set((egc) eheVar.a.bB());
                this.b.run();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((egc) ((AtomicReference) ((ehe) this.b).b).get()).e((ehn) this.a);
                return;
            case 15:
                int i2 = ((eit) this.a).a;
                if (i2 != 0) {
                    Process.setThreadPriority(i2);
                }
                this.b.run();
                return;
            case 16:
                gzp gzpVar = (gzp) this.b;
                boolean f = gzpVar.f();
                Object obj = this.a;
                if (!f || ((Boolean) ((koe) gzpVar.b()).b()).booleanValue()) {
                    synchronized (obj) {
                        ((eor) obj).a = true;
                        Activity activity = ((eor) obj).b;
                        if (activity != null) {
                            ((eor) obj).c(activity);
                        }
                        ((eor) obj).b = null;
                    }
                    return;
                }
                return;
            case 17:
                ((epn) this.b).b.d.a(5, ((eik) this.a).a);
                return;
            case 18:
                ((epn) this.b).b.d.a(6, ((eik) this.a).a);
                return;
            case 19:
                ((View) this.a).getViewTreeObserver().removeOnDrawListener(this.b);
                return;
            default:
                SharedPreferences sharedPreferences = ((Context) this.a).getSharedPreferences("PhenotypeStickyAccount", 0);
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    if ((entry.getValue() instanceof String) && entry.getValue().equals(this.b)) {
                        if (editor == null) {
                            editor = sharedPreferences.edit();
                        }
                        editor.remove(entry.getKey());
                    }
                }
                if (editor != null) {
                    editor.commit();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ drn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
