package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.ice.fishing.grenza.MainActivity;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class c implements kr2 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final Object lS5Rgt96tfkO;

    public /* synthetic */ c(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    @Override // defpackage.kr2
    public final dr2 lS5Rgt96tfkO(Class cls, z71 z71Var) {
        Application application;
        dr2 dr2Var;
        fr2 fr2Var;
        le0 le0Var;
        int i = 0;
        switch (this.PxuCJdSBwIXG) {
            case 0:
                gp gpVar = new gp(z71Var);
                Context applicationContext = ((MainActivity) this.lS5Rgt96tfkO).getApplicationContext();
                if (!(applicationContext instanceof Application)) {
                    Context context = applicationContext;
                    while (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                        if (context instanceof Application) {
                            application = (Application) context;
                        }
                    }
                    u9.EcgxDIVH5in8(applicationContext, "Could not find an Application in the given context: ");
                    return null;
                }
                application = (Application) applicationContext;
                return new e(new pv(((rv) ((d) ov2.aF05bpZJlKEP(application, d.class))).lS5Rgt96tfkO), gpVar);
            case 1:
                final yv1 yv1Var = new yv1();
                i2 i2Var = (i2) this.lS5Rgt96tfkO;
                mm2.rZjpSjn4zoMv(z71Var);
                rv rvVar = (rv) i2Var.OPXfSBeufaJ8;
                sv svVar = new sv();
                int i2 = 1;
                svVar.PxuCJdSBwIXG = new qv(rvVar, i, i2);
                svVar.lS5Rgt96tfkO = new qv(rvVar, i2, i2);
                svVar.TSizfFm2Yiuu = new qv(rvVar, 2, i2);
                svVar.Y1f8riQaR6yg = new qv(rvVar, 3, i2);
                svVar.e9gEMXR7LXtO = new qv(rvVar, 4, i2);
                svVar.a92UlCVFR9N8 = new qv(rvVar, 5, i2);
                sv svVar2 = (sv) ((qj0) ov2.aF05bpZJlKEP(svVar, qj0.class));
                svVar2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(9);
                linkedHashMap.put("wy", svVar2.PxuCJdSBwIXG);
                linkedHashMap.put("cf0", svVar2.lS5Rgt96tfkO);
                linkedHashMap.put("hm0", svVar2.TSizfFm2Yiuu);
                linkedHashMap.put("ov0", svVar2.Y1f8riQaR6yg);
                linkedHashMap.put("u51", svVar2.e9gEMXR7LXtO);
                linkedHashMap.put("wr1", svVar2.a92UlCVFR9N8);
                jr1 jr1Var = (jr1) (linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap)).get(cls.getName());
                le0 le0Var2 = (le0) z71Var.PxuCJdSBwIXG.get(rj0.Y1f8riQaR6yg);
                ((sv) ((qj0) ov2.aF05bpZJlKEP(svVar, qj0.class))).getClass();
                Object obj = Collections.EMPTY_MAP.get(cls);
                if (obj == null) {
                    if (le0Var2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (jr1Var == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    dr2Var = (dr2) jr1Var.get();
                } else {
                    if (jr1Var != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (le0Var2 == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    dr2Var = (dr2) le0Var2.OPXfSBeufaJ8(obj);
                }
                Closeable closeable = new Closeable() { // from class: oj0
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        yv1.this.PxuCJdSBwIXG();
                    }
                };
                dr2Var.getClass();
                er2 er2Var = dr2Var.PxuCJdSBwIXG;
                if (er2Var != null) {
                    if (er2Var.Y1f8riQaR6yg) {
                        er2.PxuCJdSBwIXG(closeable);
                    } else {
                        synchronized (er2Var.PxuCJdSBwIXG) {
                            er2Var.TSizfFm2Yiuu.add(closeable);
                        }
                    }
                }
                return dr2Var;
            default:
                ck PxuCJdSBwIXG = bu1.PxuCJdSBwIXG(cls);
                fr2[] fr2VarArr = (fr2[]) this.lS5Rgt96tfkO;
                fr2[] fr2VarArr2 = (fr2[]) Arrays.copyOf(fr2VarArr, fr2VarArr.length);
                int length = fr2VarArr2.length;
                while (true) {
                    if (i < length) {
                        fr2Var = fr2VarArr2[i];
                        if (!fr2Var.PxuCJdSBwIXG.equals(PxuCJdSBwIXG)) {
                            i++;
                        }
                    } else {
                        fr2Var = null;
                    }
                }
                dr2 dr2Var2 = (fr2Var == null || (le0Var = fr2Var.lS5Rgt96tfkO) == null) ? null : (dr2) le0Var.OPXfSBeufaJ8(z71Var);
                if (dr2Var2 != null) {
                    return dr2Var2;
                }
                rc1.x50lh2ztY7Y5(PxuCJdSBwIXG.lS5Rgt96tfkO(), "No initializer set for given class ");
                return null;
        }
    }
}
