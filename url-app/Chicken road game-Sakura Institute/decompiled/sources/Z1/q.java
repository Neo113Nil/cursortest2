package Z1;

import A.C0022s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import q.AbstractC1024c;
import u2.InterfaceC1228a;
import u2.InterfaceC1229b;
import w2.C1292a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC1228a, e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4597c;

    public /* synthetic */ q(Object obj, int i2, Object obj2) {
        this.f4595a = i2;
        this.f4596b = obj;
        this.f4597c = obj2;
    }

    @Override // u2.InterfaceC1228a
    public void b(InterfaceC1229b interfaceC1229b) {
        ((InterfaceC1228a) this.f4596b).b(interfaceC1229b);
        ((InterfaceC1228a) this.f4597c).b(interfaceC1229b);
    }

    @Override // Z1.e
    public Object d(v vVar) {
        String str;
        switch (this.f4595a) {
            case 2:
                Context context = (Context) vVar.a(Context.class);
                switch (((C0022s) this.f4597c).f182a) {
                    case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case AbstractC1024c.f9242c /* 9 */:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str = "";
                                        break;
                                    } else {
                                        str = "embedded";
                                        break;
                                    }
                                } else {
                                    str = "auto";
                                    break;
                                }
                            } else {
                                str = "watch";
                                break;
                            }
                        } else {
                            str = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            str = "";
                            break;
                        } else {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new C1292a((String) this.f4596b, str);
            default:
                String str2 = (String) this.f4596b;
                b bVar = (b) this.f4597c;
                try {
                    Trace.beginSection(str2);
                    return bVar.f4565e.d(vVar);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
