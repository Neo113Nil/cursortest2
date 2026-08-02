package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.AttributionSource;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.util.Log;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cms implements cmw {
    public final Context a;
    public final String b;
    public final csq c;
    public final cmk d;
    public final cno e;
    public final Looper f;
    public final int g;
    public final cmv h;
    protected final cog i;
    public final bxm j;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r12 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        if (r12 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cms(Context context, Activity activity, bxm bxmVar, cmk cmkVar, cmr cmrVar) {
        com comVar;
        coz cozVar;
        AttributionSource attributionSource;
        oy.au(context, "Null context is not permitted.");
        oy.au(cmrVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        oy.au(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        csq csqVar = null;
        String attributionTag = (Build.VERSION.SDK_INT < 30 || context == null || Build.VERSION.SDK_INT < 30) ? null : context.getAttributionTag();
        this.b = attributionTag;
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            attributionSource = context.getAttributionSource();
            csqVar = new csq(attributionSource);
        }
        this.c = csqVar;
        this.j = bxmVar;
        this.d = cmkVar;
        this.f = cmrVar.b;
        UserHandle userHandle = cmrVar.c;
        cno cnoVar = new cno(bxmVar, cmkVar, attributionTag);
        this.e = cnoVar;
        this.h = new coh(this);
        cog c = cog.c(applicationContext);
        this.i = c;
        this.g = c.i.getAndIncrement();
        ox oxVar = cmrVar.d;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            if (activity instanceof bg) {
                bg bgVar = (bg) activity;
                WeakHashMap weakHashMap = coz.a;
                by a = bgVar.a();
                WeakReference weakReference = (WeakReference) coz.a.get(bgVar);
                if (weakReference != null) {
                    com comVar2 = (coz) weakReference.get();
                    comVar = comVar2;
                }
                try {
                    coz cozVar2 = (coz) a.d("SLifecycleFragmentImpl");
                    if (cozVar2 != null) {
                        boolean z = cozVar2.t;
                        cozVar = cozVar2;
                    }
                    coz cozVar3 = new coz();
                    ae aeVar = new ae(a);
                    aeVar.d(0, cozVar3, "SLifecycleFragmentImpl", 1);
                    aeVar.h(true, true);
                    cozVar = cozVar3;
                    coz.a.put(bgVar, new WeakReference(cozVar));
                    comVar = cozVar;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            } else {
                WeakReference weakReference2 = (WeakReference) con.a.get(activity);
                if (weakReference2 != null) {
                    com comVar3 = (con) weakReference2.get();
                    comVar = comVar3;
                }
                try {
                    con conVar = (con) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (conVar == null || conVar.isRemoving()) {
                        conVar = new con();
                        activity.getFragmentManager().beginTransaction().add(conVar, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    com comVar4 = conVar;
                    con.a.put(activity, new WeakReference(comVar4));
                    comVar = comVar4;
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            }
            cnz cnzVar = (cnz) comVar.c(cnz.class);
            cnzVar = cnzVar == null ? new cnz(comVar, c) : cnzVar;
            cnzVar.e.add(cnoVar);
            c.f(cnzVar);
        }
        Handler handler = c.o;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public static Bitmap l(View view) {
        Bitmap createBitmap;
        try {
            Picture picture = new Picture();
            Canvas beginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
            beginRecording.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new Paint());
            view.draw(beginRecording);
            picture.endRecording();
            createBitmap = Bitmap.createBitmap(picture, view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            return createBitmap;
        } catch (Error | Exception e) {
            Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    @Override // defpackage.cmw
    public final cno g() {
        return this.e;
    }

    public final cpq h() {
        Set set;
        GoogleSignInAccount a;
        cpq cpqVar = new cpq();
        cmk cmkVar = this.d;
        boolean z = cmkVar instanceof cmi;
        Account account = null;
        if (z && (a = ((cmi) cmkVar).a()) != null) {
            String str = a.c;
            if (str != null) {
                account = new Account(str, "com.google");
            }
        } else if (cmkVar instanceof cxh) {
            account = ((cxh) cmkVar).b;
        }
        cpqVar.a = account;
        if (z) {
            GoogleSignInAccount a2 = ((cmi) cmkVar).a();
            set = a2 == null ? Collections.EMPTY_SET : a2.a();
        } else {
            set = Collections.EMPTY_SET;
        }
        if (cpqVar.b == null) {
            cpqVar.b = new qk(0);
        }
        cpqVar.b.addAll(set);
        Context context = this.a;
        cpqVar.d = context.getClass().getName();
        cpqVar.c = context.getPackageName();
        return cpqVar;
    }

    public final ddi i(int i, cpb cpbVar) {
        bst bstVar = new bst();
        int i2 = cpbVar.c;
        cog cogVar = this.i;
        cogVar.j(bstVar, i2, this);
        cnl cnlVar = new cnl(i, cpbVar, bstVar);
        Handler handler = cogVar.o;
        handler.sendMessage(handler.obtainMessage(4, new evt(cnlVar, cogVar.j.get(), this)));
        return (ddi) bstVar.a;
    }

    public final ddi j(cop copVar, int i) {
        bst bstVar = new bst();
        cog cogVar = this.i;
        cogVar.j(bstVar, i, this);
        cnm cnmVar = new cnm(copVar, bstVar);
        Handler handler = cogVar.o;
        handler.sendMessage(handler.obtainMessage(13, new evt(cnmVar, cogVar.j.get(), this)));
        return (ddi) bstVar.a;
    }

    public final void k(int i, cnq cnqVar) {
        boolean z = true;
        if (!cnqVar.f && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        cnqVar.f = z;
        cog cogVar = this.i;
        evt evtVar = new evt(new cni(i, cnqVar), cogVar.j.get(), this);
        Handler handler = cogVar.o;
        handler.sendMessage(handler.obtainMessage(4, evtVar));
    }

    public final cme m(Object obj, String str) {
        return ox.v(obj, this.f, str);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Runnable] */
    public final ddi n(bvw bvwVar) {
        cou couVar = (cou) bvwVar.b;
        oy.au(couVar.a(), "Listener has already been released.");
        bst bstVar = new bst();
        int i = couVar.c;
        cog cogVar = this.i;
        cogVar.j(bstVar, i, this);
        cnj cnjVar = new cnj(new bvw(couVar, (kee) bvwVar.a, (Runnable) bvwVar.c, (byte[]) null), bstVar);
        Handler handler = cogVar.o;
        handler.sendMessage(handler.obtainMessage(8, new evt(cnjVar, cogVar.j.get(), this)));
        return (ddi) bstVar.a;
    }

    public cms(Context context) {
        this(context, null, ctn.a, cmk.a, cmr.a);
        des.a(context.getApplicationContext());
    }
}
