package t1;

import A3.v;
import E1.C0034j;
import E1.X;
import K.C0054c;
import K.InterfaceC0059h;
import K.Z;
import K.h0;
import K.i0;
import T.C0089g;
import T.G;
import W.AbstractC0108a;
import W.u;
import a.AbstractC0124a;
import android.app.UiModeManager;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import c0.K;
import c0.RunnableC0282o;
import c0.q;
import e0.t;
import f3.InterfaceC0425c;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.lang.reflect.InvocationHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinVersion;
import o3.p;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import y0.E;
import y0.o;

/* loaded from: classes.dex */
public final class h implements WebMessageListenerBoundaryInterface, N1.b, InterfaceC0059h, V0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15397a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15398b;

    public /* synthetic */ h(int i4, Object obj) {
        this.f15397a = i4;
        this.f15398b = obj;
    }

    @Override // K.InterfaceC0059h
    public Object a(p pVar, InterfaceC0425c interfaceC0425c) {
        return ((InterfaceC0059h) this.f15398b).a(new N.c(pVar, null), interfaceC0425c);
    }

    @Override // V0.d
    public int b(long j4) {
        return j4 < 0 ? 0 : -1;
    }

    @Override // V0.d
    public long c(int i4) {
        AbstractC0124a.h(i4 == 0);
        return 0L;
    }

    public JSONObject d(View view) {
        int currentModeType;
        switch (this.f15397a) {
            case 12:
                JSONObject a3 = N2.b.a(0, 0, 0, 0);
                UiModeManager uiModeManager = O3.l.f2077a;
                try {
                    a3.put("noOutputDevice", N2.a.f1806a[M.j.b((uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : U.i.f3045b)] == 1);
                } catch (JSONException unused) {
                }
                return a3;
            default:
                int[] iArr = (int[]) this.f15398b;
                if (view == null) {
                    return N2.b.a(0, 0, 0, 0);
                }
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationOnScreen(iArr);
                return N2.b.a(iArr[0], iArr[1], width, height);
        }
    }

    @Override // V0.d
    public List e(long j4) {
        return j4 >= 0 ? (List) this.f15398b : Collections.EMPTY_LIST;
    }

    @Override // V0.d
    public int f() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(View view, JSONObject jSONObject, O2.b bVar, boolean z, boolean z4) {
        switch (this.f15397a) {
            case 12:
                ArrayList arrayList = new ArrayList();
                J2.c cVar = J2.c.f1173c;
                if (cVar != null) {
                    Collection unmodifiableCollection = Collections.unmodifiableCollection(cVar.f1175b);
                    IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() << 1) + 3);
                    Iterator it = unmodifiableCollection.iterator();
                    while (it.hasNext()) {
                        View view2 = (View) ((F2.i) it.next()).f784d.get();
                        if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                            View view3 = view2;
                            while (true) {
                                if (view3 == null) {
                                    View rootView = view2.getRootView();
                                    if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                        identityHashMap.put(rootView, rootView);
                                        float z5 = rootView.getZ();
                                        int size = arrayList.size();
                                        while (size > 0 && ((View) arrayList.get(size - 1)).getZ() > z5) {
                                            size--;
                                        }
                                        arrayList.add(size, rootView);
                                    }
                                } else {
                                    if (view3.getAlpha() == 0.0f) {
                                        break;
                                    }
                                    Object parent = view3.getParent();
                                    view3 = parent instanceof View ? (View) parent : null;
                                }
                            }
                        }
                    }
                }
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    bVar.a((View) obj, (h) this.f15398b, jSONObject, z4);
                }
                break;
            default:
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (z) {
                        HashMap hashMap = new HashMap();
                        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                            View childAt = viewGroup.getChildAt(i5);
                            ArrayList arrayList2 = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                hashMap.put(Float.valueOf(childAt.getZ()), arrayList2);
                            }
                            arrayList2.add(childAt);
                        }
                        ArrayList arrayList3 = new ArrayList(hashMap.keySet());
                        Collections.sort(arrayList3);
                        int size3 = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            Object obj2 = arrayList3.get(i6);
                            i6++;
                            ArrayList arrayList4 = (ArrayList) hashMap.get((Float) obj2);
                            int size4 = arrayList4.size();
                            int i7 = 0;
                            while (i7 < size4) {
                                Object obj3 = arrayList4.get(i7);
                                i7++;
                                bVar.a((View) obj3, this, jSONObject, z4);
                            }
                        }
                        break;
                    } else {
                        for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                            bVar.a(viewGroup.getChildAt(i8), this, jSONObject, z4);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // b3.InterfaceC0264a
    public Object get() {
        return new M1.d((Context) ((N1.c) this.f15398b).f1805a, new a2.i(25), new a2.i(24));
    }

    @Override // K.InterfaceC0059h
    public A3.d getData() {
        return ((InterfaceC0059h) this.f15398b).getData();
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public void h(int i4, boolean z) {
        X x4 = (X) this.f15398b;
        if (z) {
            x4.a(i4);
        } else {
            x4.getClass();
        }
    }

    public void i(int i4, int i5, o oVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j4;
        int i11;
        int i12;
        int i13;
        int i14;
        Q0.f fVar = (Q0.f) this.f15398b;
        Q0.g gVar = fVar.f2222b;
        SparseArray sparseArray = fVar.f2224c;
        u uVar = fVar.f2240k;
        u uVar2 = fVar.f2236i;
        int i15 = 2;
        int i16 = 0;
        int i17 = 1;
        if (i4 != 161 && i4 != 163) {
            if (i4 == 165) {
                if (fVar.f2208O != 2) {
                    return;
                }
                Q0.e eVar = (Q0.e) sparseArray.get(fVar.f2214U);
                int i18 = fVar.f2217X;
                u uVar3 = fVar.f2243p;
                if (i18 != 4 || !"V_VP9".equals(eVar.f2168c)) {
                    oVar.v(i5);
                    return;
                } else {
                    uVar3.J(i5);
                    oVar.readFully(uVar3.f3351a, 0, i5);
                    return;
                }
            }
            if (i4 == 16877) {
                fVar.g(i4);
                Q0.e eVar2 = fVar.f2251y;
                int i19 = eVar2.f2174h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    oVar.v(i5);
                    return;
                }
                byte[] bArr = new byte[i5];
                eVar2.f2153P = bArr;
                oVar.readFully(bArr, 0, i5);
                return;
            }
            if (i4 == 16981) {
                fVar.g(i4);
                byte[] bArr2 = new byte[i5];
                fVar.f2251y.f2176j = bArr2;
                oVar.readFully(bArr2, 0, i5);
                return;
            }
            if (i4 == 18402) {
                byte[] bArr3 = new byte[i5];
                oVar.readFully(bArr3, 0, i5);
                fVar.g(i4);
                fVar.f2251y.f2177k = new E(1, 0, 0, bArr3);
                return;
            }
            if (i4 == 21419) {
                Arrays.fill(uVar.f3351a, (byte) 0);
                oVar.readFully(uVar.f3351a, 4 - i5, i5);
                uVar.M(0);
                fVar.f2195A = (int) uVar.B();
                return;
            }
            if (i4 == 25506) {
                fVar.g(i4);
                byte[] bArr4 = new byte[i5];
                fVar.f2251y.f2178l = bArr4;
                oVar.readFully(bArr4, 0, i5);
                return;
            }
            if (i4 != 30322) {
                throw G.a(null, "Unexpected id: " + i4);
            }
            fVar.g(i4);
            byte[] bArr5 = new byte[i5];
            fVar.f2251y.f2187x = bArr5;
            oVar.readFully(bArr5, 0, i5);
            return;
        }
        if (fVar.f2208O == 0) {
            fVar.f2214U = (int) gVar.b(oVar, false, true, 8);
            fVar.f2215V = gVar.f2255c;
            fVar.f2210Q = -9223372036854775807L;
            fVar.f2208O = 1;
            uVar2.J(0);
        }
        Q0.e eVar3 = (Q0.e) sparseArray.get(fVar.f2214U);
        if (eVar3 == null) {
            oVar.v(i5 - fVar.f2215V);
            fVar.f2208O = 0;
            return;
        }
        eVar3.f2165a0.getClass();
        if (fVar.f2208O == 1) {
            fVar.k(oVar, 3);
            int i20 = (uVar2.f3351a[2] & 6) >> 1;
            byte b4 = 255;
            if (i20 == 0) {
                fVar.f2212S = 1;
                int[] iArr = fVar.f2213T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.f2213T = iArr;
                iArr[0] = (i5 - fVar.f2215V) - 3;
            } else {
                fVar.k(oVar, 4);
                int i21 = (uVar2.f3351a[3] & KotlinVersion.MAX_COMPONENT_VALUE) + 1;
                fVar.f2212S = i21;
                int[] iArr2 = fVar.f2213T;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                fVar.f2213T = iArr2;
                if (i20 == 2) {
                    int i22 = (i5 - fVar.f2215V) - 4;
                    int i23 = fVar.f2212S;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw G.a(null, "Unexpected lacing value: " + i20);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = fVar.f2212S - i17;
                            if (i24 >= i27) {
                                i6 = i15;
                                i7 = i16;
                                i8 = i17;
                                fVar.f2213T[i27] = ((i5 - fVar.f2215V) - i26) - i25;
                                break;
                            }
                            fVar.f2213T[i24] = i16;
                            int i28 = i26 + 1;
                            fVar.k(oVar, i28);
                            if (uVar2.f3351a[i26] == 0) {
                                throw G.a(null, "No valid varint length mask found");
                            }
                            int i29 = i16;
                            while (true) {
                                if (i29 >= 8) {
                                    i9 = i15;
                                    i10 = i17;
                                    j4 = 0;
                                    i11 = i28;
                                    break;
                                }
                                int i30 = i17 << (7 - i29);
                                i9 = i15;
                                if ((uVar2.f3351a[i26] & i30) != 0) {
                                    int i31 = i28 + i29;
                                    fVar.k(oVar, i31);
                                    i10 = i17;
                                    j4 = uVar2.f3351a[i26] & b4 & (~i30);
                                    while (i28 < i31) {
                                        j4 = (j4 << 8) | (uVar2.f3351a[i28] & b4);
                                        i28++;
                                        i31 = i31;
                                        b4 = 255;
                                    }
                                    i11 = i31;
                                    if (i24 > 0) {
                                        j4 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    i15 = i9;
                                    b4 = 255;
                                }
                            }
                            if (j4 < -2147483648L || j4 > 2147483647L) {
                                break;
                            }
                            int i32 = (int) j4;
                            int[] iArr3 = fVar.f2213T;
                            if (i24 != 0) {
                                i32 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i32;
                            i25 += i32;
                            i24++;
                            i16 = i29;
                            i15 = i9;
                            i17 = i10;
                            i26 = i11;
                            b4 = 255;
                        }
                        throw G.a(null, "EBML lacing sample size out of range.");
                    }
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 4;
                    while (true) {
                        i12 = fVar.f2212S - 1;
                        if (i33 >= i12) {
                            break;
                        }
                        fVar.f2213T[i33] = 0;
                        while (true) {
                            i13 = i35 + 1;
                            fVar.k(oVar, i13);
                            int i36 = uVar2.f3351a[i35] & 255;
                            int[] iArr4 = fVar.f2213T;
                            i14 = iArr4[i33] + i36;
                            iArr4[i33] = i14;
                            if (i36 != 255) {
                                break;
                            } else {
                                i35 = i13;
                            }
                        }
                        i34 += i14;
                        i33++;
                        i35 = i13;
                    }
                    fVar.f2213T[i12] = ((i5 - fVar.f2215V) - i35) - i34;
                }
            }
            i6 = 2;
            i7 = 0;
            i8 = 1;
            byte[] bArr6 = uVar2.f3351a;
            fVar.f2209P = fVar.m((bArr6[i8] & 255) | (bArr6[i7] << 8)) + fVar.f2206M;
            fVar.f2216W = (eVar3.f2171e == i8 || (i4 == 163 && (uVar2.f3351a[i6] & 128) == 128)) ? 1 : i7;
            fVar.f2208O = i6;
            fVar.f2211R = i7;
        }
        if (i4 == 163) {
            while (true) {
                int i37 = fVar.f2211R;
                if (i37 >= fVar.f2212S) {
                    fVar.f2208O = 0;
                    return;
                } else {
                    fVar.h(eVar3, ((fVar.f2211R * eVar3.f2172f) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) + fVar.f2209P, fVar.f2216W, fVar.n(oVar, eVar3, fVar.f2213T[i37], false), 0);
                    fVar.f2211R++;
                }
            }
        } else {
            while (true) {
                int i38 = fVar.f2211R;
                if (i38 >= fVar.f2212S) {
                    return;
                }
                int[] iArr5 = fVar.f2213T;
                iArr5[i38] = fVar.n(oVar, eVar3, iArr5[i38], true);
                fVar.f2211R++;
            }
        }
    }

    public h0 j() {
        v vVar = (v) this.f15398b;
        vVar.getClass();
        Object obj = v.f139e.get(vVar);
        if (obj == B3.k.f239a) {
            obj = null;
        }
        return (h0) obj;
    }

    public void k(int i4, long j4) {
        Q0.f fVar = (Q0.f) this.f15398b;
        if (i4 == 240) {
            if (fVar.z) {
                return;
            }
            fVar.f(i4);
            if (fVar.f2202H == -1) {
                fVar.f2202H = j4;
                return;
            }
            return;
        }
        if (i4 == 241) {
            if (fVar.z) {
                return;
            }
            fVar.f(i4);
            if (fVar.f2201G == -1) {
                fVar.f2201G = j4;
                return;
            }
            return;
        }
        if (i4 == 20529) {
            if (j4 == 0) {
                return;
            }
            throw G.a(null, "ContentEncodingOrder " + j4 + " not supported");
        }
        if (i4 == 20530) {
            if (j4 == 1) {
                return;
            }
            throw G.a(null, "ContentEncodingScope " + j4 + " not supported");
        }
        switch (i4) {
            case 131:
                int i5 = (int) j4;
                if (i5 == 1) {
                    fVar.g(i4);
                    fVar.f2251y.f2171e = 2;
                    return;
                }
                if (i5 == 2) {
                    fVar.g(i4);
                    fVar.f2251y.f2171e = 1;
                    return;
                } else if (i5 == 17) {
                    fVar.g(i4);
                    fVar.f2251y.f2171e = 3;
                    return;
                } else if (i5 != 33) {
                    fVar.g(i4);
                    fVar.f2251y.f2171e = -1;
                    return;
                } else {
                    fVar.g(i4);
                    fVar.f2251y.f2171e = 5;
                    return;
                }
            case 136:
                fVar.g(i4);
                fVar.f2251y.f2162Y = j4 == 1;
                return;
            case 155:
                fVar.f2210Q = fVar.m(j4);
                return;
            case 159:
                fVar.g(i4);
                fVar.f2251y.f2154Q = (int) j4;
                return;
            case 176:
                fVar.g(i4);
                fVar.f2251y.n = (int) j4;
                return;
            case 179:
                if (fVar.z) {
                    return;
                }
                fVar.f(i4);
                fVar.f2199E = fVar.m(j4);
                return;
            case 186:
                fVar.g(i4);
                fVar.f2251y.o = (int) j4;
                return;
            case 215:
                fVar.g(i4);
                fVar.f2251y.f2170d = (int) j4;
                return;
            case 231:
                fVar.f2206M = fVar.m(j4);
                return;
            case 238:
                fVar.f2217X = (int) j4;
                return;
            case 247:
                if (fVar.z) {
                    return;
                }
                fVar.f(i4);
                fVar.f2200F = (int) j4;
                return;
            case 251:
                fVar.f2218Y = true;
                return;
            case 16871:
                fVar.g(i4);
                fVar.f2251y.f2174h = (int) j4;
                return;
            case 16980:
                if (j4 == 3) {
                    return;
                }
                throw G.a(null, "ContentCompAlgo " + j4 + " not supported");
            case 17029:
                if (j4 < 1 || j4 > 2) {
                    throw G.a(null, "DocTypeReadVersion " + j4 + " not supported");
                }
                return;
            case 17143:
                if (j4 == 1) {
                    return;
                }
                throw G.a(null, "EBMLReadVersion " + j4 + " not supported");
            case 18401:
                if (j4 == 5) {
                    return;
                }
                throw G.a(null, "ContentEncAlgo " + j4 + " not supported");
            case 18408:
                if (j4 == 1) {
                    return;
                }
                throw G.a(null, "AESSettingsCipherMode " + j4 + " not supported");
            case 21420:
                fVar.f2196B = j4 + fVar.f2246s;
                return;
            case 21432:
                int i6 = (int) j4;
                fVar.g(i4);
                if (i6 == 0) {
                    fVar.f2251y.f2188y = 0;
                    return;
                }
                if (i6 == 1) {
                    fVar.f2251y.f2188y = 2;
                    return;
                } else if (i6 == 3) {
                    fVar.f2251y.f2188y = 1;
                    return;
                } else {
                    if (i6 != 15) {
                        return;
                    }
                    fVar.f2251y.f2188y = 3;
                    return;
                }
            case 21680:
                fVar.g(i4);
                fVar.f2251y.f2181q = (int) j4;
                return;
            case 21682:
                fVar.g(i4);
                fVar.f2251y.f2183s = (int) j4;
                return;
            case 21690:
                fVar.g(i4);
                fVar.f2251y.f2182r = (int) j4;
                return;
            case 21930:
                fVar.g(i4);
                fVar.f2251y.f2161X = j4 == 1;
                return;
            case 21938:
                fVar.g(i4);
                Q0.e eVar = fVar.f2251y;
                eVar.z = true;
                eVar.f2180p = (int) j4;
                return;
            case 21998:
                fVar.g(i4);
                fVar.f2251y.f2173g = (int) j4;
                return;
            case 22186:
                fVar.g(i4);
                fVar.f2251y.f2157T = j4;
                return;
            case 22203:
                fVar.g(i4);
                fVar.f2251y.f2158U = j4;
                return;
            case 25188:
                fVar.g(i4);
                fVar.f2251y.f2155R = (int) j4;
                return;
            case 30114:
                fVar.f2219Z = j4;
                return;
            case 30321:
                fVar.g(i4);
                int i7 = (int) j4;
                if (i7 == 0) {
                    fVar.f2251y.f2184t = 0;
                    return;
                }
                if (i7 == 1) {
                    fVar.f2251y.f2184t = 1;
                    return;
                } else if (i7 == 2) {
                    fVar.f2251y.f2184t = 2;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    fVar.f2251y.f2184t = 3;
                    return;
                }
            case 2352003:
                fVar.g(i4);
                fVar.f2251y.f2172f = (int) j4;
                return;
            case 2807729:
                fVar.f2247t = j4;
                return;
            default:
                switch (i4) {
                    case 21945:
                        fVar.g(i4);
                        int i8 = (int) j4;
                        if (i8 == 1) {
                            fVar.f2251y.f2141C = 2;
                            return;
                        } else {
                            if (i8 != 2) {
                                return;
                            }
                            fVar.f2251y.f2141C = 1;
                            return;
                        }
                    case 21946:
                        fVar.g(i4);
                        int g4 = C0089g.g((int) j4);
                        if (g4 != -1) {
                            fVar.f2251y.f2140B = g4;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.g(i4);
                        fVar.f2251y.z = true;
                        int f4 = C0089g.f((int) j4);
                        if (f4 != -1) {
                            fVar.f2251y.f2139A = f4;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.g(i4);
                        fVar.f2251y.f2142D = (int) j4;
                        return;
                    case 21949:
                        fVar.g(i4);
                        fVar.f2251y.f2143E = (int) j4;
                        return;
                    default:
                        return;
                }
        }
    }

    public void l(Exception exc) {
        AbstractC0108a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        q qVar = ((K) this.f15398b).f5502P0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC0282o(qVar, exc, 8));
        }
    }

    public void m(int i4, long j4, long j5) {
        Q0.f fVar = (Q0.f) this.f15398b;
        fVar.f2239j0.getClass();
        if (i4 == 160) {
            fVar.f2218Y = false;
            fVar.f2219Z = 0L;
            return;
        }
        if (i4 == 174) {
            Q0.e eVar = new Q0.e();
            eVar.n = -1;
            eVar.o = -1;
            eVar.f2180p = -1;
            eVar.f2181q = -1;
            eVar.f2182r = -1;
            eVar.f2183s = 0;
            eVar.f2184t = -1;
            eVar.f2185u = 0.0f;
            eVar.v = 0.0f;
            eVar.f2186w = 0.0f;
            eVar.f2187x = null;
            eVar.f2188y = -1;
            eVar.z = false;
            eVar.f2139A = -1;
            eVar.f2140B = -1;
            eVar.f2141C = -1;
            eVar.f2142D = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
            eVar.f2143E = 200;
            eVar.f2144F = -1.0f;
            eVar.f2145G = -1.0f;
            eVar.f2146H = -1.0f;
            eVar.f2147I = -1.0f;
            eVar.f2148J = -1.0f;
            eVar.f2149K = -1.0f;
            eVar.L = -1.0f;
            eVar.f2150M = -1.0f;
            eVar.f2151N = -1.0f;
            eVar.f2152O = -1.0f;
            eVar.f2154Q = 1;
            eVar.f2155R = -1;
            eVar.f2156S = 8000;
            eVar.f2157T = 0L;
            eVar.f2158U = 0L;
            eVar.f2160W = false;
            eVar.f2162Y = true;
            eVar.f2163Z = "eng";
            fVar.f2251y = eVar;
            eVar.f2164a = fVar.f2249w;
            return;
        }
        if (i4 == 183) {
            if (fVar.z) {
                return;
            }
            fVar.f(i4);
            fVar.f2200F = -1;
            fVar.f2201G = -1L;
            fVar.f2202H = -1L;
            return;
        }
        if (i4 == 187) {
            if (fVar.z) {
                return;
            }
            fVar.f(i4);
            fVar.f2199E = -9223372036854775807L;
            return;
        }
        if (i4 == 19899) {
            fVar.f2195A = -1;
            fVar.f2196B = -1L;
            return;
        }
        if (i4 == 20533) {
            fVar.g(i4);
            fVar.f2251y.f2175i = true;
            return;
        }
        if (i4 == 21968) {
            fVar.g(i4);
            fVar.f2251y.z = true;
            return;
        }
        if (i4 == 408125543) {
            long j6 = fVar.f2246s;
            if (j6 != -1 && j6 != j4) {
                throw G.a(null, "Multiple Segment elements not supported");
            }
            fVar.f2246s = j4;
            fVar.f2245r = j5;
            return;
        }
        if (i4 == 475249515) {
            if (fVar.z) {
                return;
            }
            fVar.f2198D = true;
        } else if (i4 == 524531317 && !fVar.z) {
            if (fVar.f2226d && fVar.f2205K != -1) {
                fVar.f2204J = true;
            } else {
                fVar.f2239j0.x(new A0.b(fVar.v));
                fVar.z = true;
            }
        }
    }

    public void n(int i4, String str) {
        Q0.f fVar = (Q0.f) this.f15398b;
        if (i4 == 134) {
            fVar.g(i4);
            fVar.f2251y.f2168c = str;
            return;
        }
        if (i4 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.f2249w = str.equals("webm");
                return;
            }
            throw G.a(null, "DocType " + str + " not supported");
        }
        if (i4 == 21358) {
            fVar.g(i4);
            fVar.f2251y.f2166b = str;
        } else {
            if (i4 != 2274716) {
                return;
            }
            fVar.g(i4);
            fVar.f2251y.f2163Z = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f1365a > r3.f1365a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(h0 newState) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.i.e(newState, "newState");
        v vVar = (v) this.f15398b;
        do {
            vVar.getClass();
            Object obj3 = v.f139e.get(vVar);
            obj = B3.k.f239a;
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            h0 h0Var = (h0) obj2;
            if (!(h0Var instanceof Z ? true : kotlin.jvm.internal.i.a(h0Var, i0.f1370b))) {
                if (!(h0Var instanceof C0054c)) {
                    if (!(h0Var instanceof K.X)) {
                        throw new G1.a();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (h0Var != null) {
                    obj = h0Var;
                }
            }
            h0Var = newState;
            if (obj2 == null) {
            }
            if (h0Var != null) {
            }
        } while (!vVar.a(obj2, obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[ORIG_RETURN, RETURN] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        C0034j c0034j;
        C0034j c0034j2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) V3.b.j(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        t[] tVarArr = new t[ports.length];
        for (int i4 = 0; i4 < ports.length; i4++) {
            InvocationHandler invocationHandler3 = ports[i4];
            t tVar = new t();
            tVar.f8416a = (WebMessagePortBoundaryInterface) V3.b.j(WebMessagePortBoundaryInterface.class, invocationHandler3);
            tVarArr[i4] = tVar;
        }
        if (k.f15401a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) V3.b.j(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                c0034j = new C0034j(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    c0034j2 = null;
                    if (c0034j2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) V3.b.j(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        l2.e eVar = (l2.e) ((h) this.f15398b).f15398b;
                        int i5 = c0034j2.f623b;
                        if (i5 != 0) {
                            StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
                            sb.append(i5 != 0 ? i5 != 1 ? "Unknown" : "ArrayBuffer" : "String");
                            sb.append(" expected, but got ");
                            sb.append("String");
                            throw new IllegalStateException(sb.toString());
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(c0034j2.f622a);
                            String string = jSONObject.getString("method");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            ((a2.i) eVar.f14271c).getClass();
                            a2.i.s(string, jSONObject2);
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                    return;
                }
                byte[] asArrayBuffer = webMessagePayloadBoundaryInterface.getAsArrayBuffer();
                c0034j = new C0034j();
                Objects.requireNonNull(asArrayBuffer);
                c0034j.f622a = null;
                c0034j.f623b = 1;
            }
        } else {
            c0034j = new C0034j(webMessageBoundaryInterface.getData());
        }
        c0034j2 = c0034j;
        if (c0034j2 == null) {
        }
    }

    public /* synthetic */ h(int i4, boolean z) {
        this.f15397a = i4;
    }

    public h(HashMap hashMap) {
        this.f15397a = 6;
        this.f15398b = Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public h(boolean z) {
        this.f15397a = 15;
        this.f15398b = new AtomicBoolean(z);
    }

    public h(int i4) {
        this.f15397a = i4;
        switch (i4) {
            case 8:
                this.f15398b = new AtomicInteger(0);
                break;
            case 9:
                this.f15398b = new v(i0.f1370b);
                break;
            case 11:
                this.f15398b = new LinkedHashSet();
                break;
            case 13:
                this.f15398b = new int[2];
                break;
            case 21:
                this.f15398b = new X();
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
                this.f15398b = new K3.l(J3.d.f1209i);
                break;
        }
    }

    public h(UUID uuid, int i4, byte[] bArr, UUID[] uuidArr) {
        this.f15397a = 20;
        this.f15398b = uuid;
    }

    public h(H3.a aVar) {
        this.f15397a = 7;
        this.f15398b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
