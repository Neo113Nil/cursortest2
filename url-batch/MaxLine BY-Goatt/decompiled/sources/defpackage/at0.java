package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class at0 implements n60, f52, hs, oc2, sh {
    public Object m;

    public at0(int i) {
        switch (i) {
            case 8:
                this.m = new at0();
                break;
            case 11:
                this.m = Build.VERSION.SDK_INT >= 28 ? new x12(2) : new nm1(11);
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                this.m = new mg1();
                break;
            case 19:
                this.m = new LinkedHashSet();
                break;
            case 20:
                this.m = new Region();
                break;
            default:
                this.m = null;
                break;
        }
    }

    public static mq2 k(d72 d72Var, r01 r01Var, ak1 ak1Var, bk1 bk1Var) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(r01Var.a.getResources(), bk1Var.a);
        m60 m60Var = m60.m;
        Map map = bk1Var.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = l.a;
        if (d72Var != null && d72Var.g) {
            z = true;
        }
        return new mq2(bitmapDrawable, r01Var, m60Var, ak1Var, str, booleanValue, z);
    }

    @Override // defpackage.n60
    public Object a(Function2 function2, pr2 pr2Var) {
        return ((n60) this.m).a(new z32(function2, null, 0), pr2Var);
    }

    @Override // defpackage.oc2
    public nc2 b(String str) {
        str.getClass();
        return new zq2(((br2) this.m).I());
    }

    @Override // defpackage.sh
    public Object c(ff2 ff2Var, Float f, Float f2, Function1 function1, hm2 hm2Var) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object d = yh2.d(ff2Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, tk3.i(0.0f, floatValue2), (eo2) this.m, function1, hm2Var);
        return d == b50.m ? d : (jd) d;
    }

    @Override // defpackage.f52
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.f52
    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = BuildConfig.FLAVOR;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.m).setResultCode(i);
    }

    @Override // defpackage.n60
    public xm0 f() {
        return ((n60) this.m).f();
    }

    public x62 g() {
        mb0 m;
        w50 w50Var = (w50) this.m;
        ob0 ob0Var = (ob0) w50Var.d;
        synchronized (ob0Var) {
            w50Var.b(true);
            m = ob0Var.m(((lb0) w50Var.b).a);
        }
        if (m != null) {
            return new x62(m);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        if (r7 != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0121, code lost:
    
        if (java.lang.Math.abs(r2 - (r10 * r3)) > 1.0d) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0145, code lost:
    
        if (r12 != r18) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0148, code lost:
    
        if (r0 != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x014d, code lost:
    
        if (r12 <= r18) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014f, code lost:
    
        if (r7 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0134, code lost:
    
        if (java.lang.Math.abs(r8 - r1) > 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0140, code lost:
    
        if (java.lang.Math.abs(r2 - r3) > 1) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bk1 h(r01 r01Var, ak1 ak1Var, pl2 pl2Var, me2 me2Var) {
        bk1 bk1Var;
        double d;
        bk1 bk1Var2;
        boolean equals;
        bk1 bk1Var3;
        if (r01Var.n.m) {
            e72 e72Var = (e72) ((b72) this.m).c.getValue();
            if (e72Var != null) {
                bk1Var = e72Var.a.h(ak1Var);
                if (bk1Var == null) {
                    r5 r5Var = e72Var.b;
                    synchronized (r5Var) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) r5Var.b).get(ak1Var);
                            if (arrayList != null) {
                                int size = arrayList.size();
                                int i = 0;
                                while (true) {
                                    if (i >= size) {
                                        bk1Var3 = null;
                                        break;
                                    }
                                    k72 k72Var = (k72) arrayList.get(i);
                                    Bitmap bitmap = (Bitmap) k72Var.b.get();
                                    bk1Var3 = bitmap != null ? new bk1(bitmap, k72Var.c) : null;
                                    if (bk1Var3 != null) {
                                        break;
                                    }
                                    i++;
                                }
                                int i2 = r5Var.a;
                                r5Var.a = i2 + 1;
                                if (i2 >= 10) {
                                    r5Var.b();
                                }
                                bk1Var = bk1Var3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (bk1Var != null) {
                    Bitmap bitmap2 = bk1Var.a;
                    Bitmap.Config config = bitmap2.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    if (!k31.o(config) || r01Var.k) {
                        Object obj = bk1Var.b.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        if (Intrinsics.b(pl2Var, pl2.c)) {
                            bk1Var2 = null;
                        } else {
                            String str = (String) ak1Var.n.get("coil#transformation_size");
                            if (str != null) {
                                equals = str.equals(pl2Var.toString());
                            } else {
                                int width = bitmap2.getWidth();
                                int height = bitmap2.getHeight();
                                zm3 zm3Var = pl2Var.a;
                                int i3 = zm3Var instanceof gb0 ? ((gb0) zm3Var).o : Integer.MAX_VALUE;
                                zm3 zm3Var2 = pl2Var.b;
                                int i4 = zm3Var2 instanceof gb0 ? ((gb0) zm3Var2).o : Integer.MAX_VALUE;
                                double q = yj1.q(width, height, i3, i4, me2Var);
                                boolean a = k.a(r01Var);
                                if (a) {
                                    double d2 = q > 1.0d ? 1.0d : q;
                                    bk1Var2 = null;
                                    d = 1.0d;
                                    if (Math.abs(i3 - (width * d2)) > 1.0d) {
                                    }
                                    equals = true;
                                } else {
                                    d = 1.0d;
                                    bk1Var2 = null;
                                    if (i3 != Integer.MIN_VALUE) {
                                        if (i3 != Integer.MAX_VALUE) {
                                        }
                                    }
                                    if (i4 != Integer.MIN_VALUE) {
                                        if (i4 != Integer.MAX_VALUE) {
                                        }
                                    }
                                    equals = true;
                                }
                            }
                        }
                        return !equals ? bk1Var : bk1Var2;
                    }
                    equals = false;
                    bk1Var2 = null;
                    if (!equals) {
                    }
                }
            }
            bk1Var = null;
            if (bk1Var != null) {
            }
        }
        return null;
    }

    public void i() {
        View view = (View) this.m;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public ak1 j(r01 r01Var, Object obj, uw1 uw1Var, oi0 oi0Var) {
        String str;
        Map map;
        r01Var.getClass();
        List list = r01Var.f;
        List list2 = ((b72) this.m).f.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str = null;
                break;
            }
            Pair pair = (Pair) list2.get(i);
            i81 i81Var = (i81) pair.m;
            if (((Class) pair.n).isAssignableFrom(obj.getClass())) {
                i81Var.getClass();
                str = i81Var.a(obj, uw1Var);
                if (str != null) {
                    break;
                }
            }
            i++;
        }
        if (str == null) {
            return null;
        }
        Map map2 = r01Var.x.m;
        if (map2.isEmpty()) {
            map = mi1.c();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                b71.o();
                return null;
            }
            map = linkedHashMap;
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new ak1(str, mi1.c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        if (!list.isEmpty()) {
            if (list.size() > 0) {
                list.get(0).getClass();
                b71.o();
                return null;
            }
            linkedHashMap2.put("coil#transformation_size", uw1Var.d.toString());
        }
        return new ak1(str, linkedHashMap2);
    }

    public t21 l(tt1 tt1Var, t7 t7Var) {
        Object obj;
        long j;
        boolean z;
        long G;
        mg1 mg1Var = (mg1) this.m;
        List list = (List) tt1Var.n;
        mg1 mg1Var2 = new mg1(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            v22 v22Var = (v22) list.get(i);
            long j2 = v22Var.a;
            int p = yk3.p(mg1Var.n, mg1Var.p, j2);
            if (p < 0 || (obj = mg1Var.o[p]) == o70.e) {
                obj = null;
            }
            u22 u22Var = (u22) obj;
            if (u22Var == null) {
                j = v22Var.b;
                G = v22Var.d;
                z = false;
            } else {
                j = u22Var.a;
                z = u22Var.c;
                G = t7Var.G(u22Var.b);
            }
            long j3 = v22Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            mg1Var2.c(j3, new t22(j3, v22Var.b, v22Var.d, v22Var.e, v22Var.f, j, G, z, v22Var.g, v22Var.i, v22Var.j, v22Var.k));
            boolean z2 = v22Var.e;
            if (z2) {
                mg1Var.c(j2, new u22(v22Var.b, v22Var.c, z2));
            } else {
                mg1Var.d(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new t21(20, mg1Var2, tt1Var);
    }

    public void m() {
        View view;
        View view2 = (View) this.m;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new k3(22, view));
    }

    @Override // defpackage.hs
    public void onCancel() {
        ((bo2) this.m).a();
    }

    public at0(ca0 ca0Var) {
        this.m = new qm0(co2.a, ca0Var);
    }

    public /* synthetic */ at0(Object obj) {
        this.m = obj;
    }
}
