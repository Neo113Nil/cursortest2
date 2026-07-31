package c4;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f2161a;

    y1(Executor executor) {
        this.f2161a = executor;
    }

    public final Executor a() {
        return this.f2161a;
    }

    public final void b(final String str, final String str2, final c2... c2VarArr) {
        this.f2161a.execute(new Runnable(str, str2, c2VarArr) { // from class: c4.a2

            /* renamed from: f, reason: collision with root package name */
            private final String f1927f;

            /* renamed from: g, reason: collision with root package name */
            private final String f1928g;

            /* renamed from: h, reason: collision with root package name */
            private final c2[] f1929h;

            {
                this.f1927f = str;
                this.f1928g = str2;
                this.f1929h = c2VarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String sb;
                final JSONObject jSONObject;
                String sb2;
                Throwable e7;
                String str3 = this.f1927f;
                String str4 = this.f1928g;
                c2[] c2VarArr2 = this.f1929h;
                if (!TextUtils.isEmpty(str3)) {
                    final String lowerCase = str3.toLowerCase();
                    if (TextUtils.isEmpty(str4)) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(str4);
                        } catch (JSONException unused) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str4).length());
                            sb3.append("Action[");
                            sb3.append(lowerCase);
                            sb3.append("]: failed to parse args: ");
                            sb3.append(str4);
                            sb = sb3.toString();
                        }
                    }
                    String valueOf = String.valueOf(jSONObject);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(lowerCase).length() + 10 + valueOf.length());
                    sb4.append("Action[");
                    sb4.append(lowerCase);
                    sb4.append("]: ");
                    sb4.append(valueOf);
                    Log.d("UserMessagingPlatform", sb4.toString());
                    for (final c2 c2Var : c2VarArr2) {
                        FutureTask futureTask = new FutureTask(new Callable(c2Var, lowerCase, jSONObject) { // from class: c4.z1

                            /* renamed from: a, reason: collision with root package name */
                            private final c2 f2166a;

                            /* renamed from: b, reason: collision with root package name */
                            private final String f2167b;

                            /* renamed from: c, reason: collision with root package name */
                            private final JSONObject f2168c;

                            {
                                this.f2166a = c2Var;
                                this.f2167b = lowerCase;
                                this.f2168c = jSONObject;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(this.f2166a.a(this.f2167b, this.f2168c));
                            }
                        });
                        c2Var.zza().execute(futureTask);
                        try {
                        } catch (InterruptedException e8) {
                            e7 = e8;
                            StringBuilder sb5 = new StringBuilder(String.valueOf(lowerCase).length() + 33);
                            sb5.append("Thread interrupted for Action[");
                            sb5.append(lowerCase);
                            sb5.append("]: ");
                            sb2 = sb5.toString();
                            d1.a(sb2, e7);
                        } catch (ExecutionException e9) {
                            StringBuilder sb6 = new StringBuilder(String.valueOf(lowerCase).length() + 24);
                            sb6.append("Failed to run Action[");
                            sb6.append(lowerCase);
                            sb6.append("]: ");
                            sb2 = sb6.toString();
                            e7 = e9.getCause();
                            d1.a(sb2, e7);
                        }
                        if (((Boolean) futureTask.get()).booleanValue()) {
                            return;
                        }
                    }
                    return;
                }
                sb = "Error on action: empty action name";
                Log.d("UserMessagingPlatform", sb);
            }
        });
    }
}
