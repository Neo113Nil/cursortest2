package b6;

import a0.s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.FirebaseCommonRegistrar;
import e5.f;
import e5.v;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements f, z5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1397c;

    public /* synthetic */ d(Object obj, int i7, Object obj2) {
        this.f1395a = i7;
        this.f1396b = obj;
        this.f1397c = obj2;
    }

    @Override // z5.a
    public void a(z5.b bVar) {
        z5.a aVar = (z5.a) this.f1396b;
        z5.a aVar2 = (z5.a) this.f1397c;
        aVar.a(bVar);
        aVar2.a(bVar);
    }

    @Override // e5.f
    public Object b(v vVar) {
        String valueOf;
        switch (this.f1395a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) this.f1396b;
                s sVar = (s) this.f1397c;
                Context context = (Context) vVar.a(Context.class);
                switch (sVar.f134a) {
                    case q.c.f7259c /* 9 */:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            valueOf = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case q.c.f7261e /* 10 */:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            valueOf = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        valueOf = "";
                        break;
                    case 11:
                        int i7 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        valueOf = "embedded";
                                        break;
                                    }
                                    valueOf = "";
                                    break;
                                } else {
                                    valueOf = "auto";
                                    break;
                                }
                            } else {
                                valueOf = "watch";
                                break;
                            }
                        } else {
                            valueOf = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            valueOf = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        valueOf = "";
                        break;
                }
                return new a(str, valueOf);
            default:
                String str2 = (String) this.f1396b;
                e5.c cVar = (e5.c) this.f1397c;
                try {
                    Trace.beginSection(str2);
                    return cVar.f2764e.b(vVar);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
