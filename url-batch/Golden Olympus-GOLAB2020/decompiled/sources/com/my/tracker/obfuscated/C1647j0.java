package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.tracker.obfuscated.C1647j0;

/* renamed from: com.my.tracker.obfuscated.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1647j0 {

    /* renamed from: a, reason: collision with root package name */
    private C1643i0 f21380a;

    /* renamed from: b, reason: collision with root package name */
    boolean f21381b = false;

    /* renamed from: com.my.tracker.obfuscated.j0$a */
    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1676q1 f21382a;

        a(C1676q1 c1676q1) {
            this.f21382a = c1676q1;
        }

        @Override // com.my.tracker.obfuscated.C1647j0.c
        public void a() {
            AbstractC1708y2.a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }

        @Override // com.my.tracker.obfuscated.C1647j0.c
        public void a(String str) {
            C1647j0.this.f21380a = new C1643i0(str);
            this.f21382a.j(str);
            AbstractC1708y2.a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + C1647j0.this.f21380a.f21367a);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.j0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f21384a;

        static {
            boolean z4;
            try {
                z4 = FirebaseAnalytics.class.equals(FirebaseAnalytics.class);
            } catch (Throwable th) {
                AbstractC1708y2.a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                z4 = false;
            }
            f21384a = z4;
        }

        static void a(Context context, final c cVar) {
            try {
                AbstractC1708y2.a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).getAppInstanceId().addOnCompleteListener(AbstractC1658m.f21417b, new OnCompleteListener() { // from class: com.my.tracker.obfuscated.N2
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C1647j0.b.a(C1647j0.c.this, task);
                    }
                });
            } catch (Throwable th) {
                AbstractC1708y2.a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, Task task) {
            if (task.isComplete() && task.isSuccessful()) {
                cVar.a((String) task.getResult());
            } else {
                cVar.a();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.j0$c */
    public interface c {
        void a();

        void a(String str);
    }

    public C1643i0 a(Context context) {
        if (this.f21381b) {
            return this.f21380a;
        }
        C1676q1 a4 = C1676q1.a(context);
        String i4 = a4.i();
        if (!TextUtils.isEmpty(i4)) {
            AbstractC1708y2.a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + i4);
        }
        if (b.f21384a) {
            b.a(context, new a(a4));
            this.f21381b = true;
            return this.f21380a;
        }
        AbstractC1708y2.a("FirebaseAppInstanceIdProvider: firebase analytics is not available, use cached value '" + i4 + "'");
        C1643i0 c1643i0 = new C1643i0(i4);
        this.f21380a = c1643i0;
        return c1643i0;
    }
}
