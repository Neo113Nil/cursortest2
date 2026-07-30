package G1;

import B1.C;
import D.H;
import F3.q;
import N2.C0324j;
import O2.w;
import P.u;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Base64OutputStream;
import android.util.JsonWriter;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import b8.l;
import b8.s;
import b8.y;
import c8.m;
import c8.o;
import c8.p;
import com.anythink.basead.b.c.i;
import com.bumptech.glide.f;
import com.google.android.gms.internal.ads.AbstractC3217fl;
import com.google.android.gms.internal.ads.AbstractC3548lu;
import com.google.android.gms.internal.ads.C2518Df;
import com.google.android.gms.internal.ads.C2593Hm;
import com.google.android.gms.internal.ads.C2834Vp;
import com.google.android.gms.internal.ads.C2959b;
import com.google.android.gms.internal.ads.C3002bo;
import com.google.android.gms.internal.ads.C3119dx;
import com.google.android.gms.internal.ads.C3347i6;
import com.google.android.gms.internal.ads.C3386iu;
import com.google.android.gms.internal.ads.C3561m6;
import com.google.android.gms.internal.ads.C3614n5;
import com.google.android.gms.internal.ads.C4250yv;
import com.google.android.gms.internal.ads.C8;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.ads.D8;
import com.google.android.gms.internal.ads.I5;
import com.google.android.gms.internal.ads.InterfaceC3234g1;
import com.google.android.gms.internal.ads.J0;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.Lr;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.TC;
import com.google.android.gms.internal.ads.Ut;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.C4546e;
import h.C4548g;
import h.C4549h;
import h.DialogInterfaceC4550i;
import h3.InterfaceC4567a;
import h3.n;
import j1.C4589b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import kotlin.jvm.internal.h;
import p2.j;
import q7.AbstractC4932a;
import q7.C4933b;
import q7.v;
import r7.C4977h;
import t0.AbstractC5051n;
import u1.x;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5217a;

/* loaded from: classes.dex */
public final class a implements c, InterfaceC3234g1, LD, InterfaceC4567a, u, u2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1193n;

    /* renamed from: u, reason: collision with root package name */
    public int f1194u;

    /* renamed from: v, reason: collision with root package name */
    public Object f1195v;

    public /* synthetic */ a(char c4, int i) {
        this.f1193n = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, C4933b c4933b, AbstractC5217a abstractC5217a) {
        p pVar;
        int i;
        byte f6;
        LinkedHashMap linkedHashMap;
        H h9;
        a aVar2;
        byte b9;
        LinkedHashMap linkedHashMap2;
        if (abstractC5217a instanceof p) {
            pVar = (p) abstractC5217a;
            int i4 = pVar.f5788z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pVar.f5788z = i4 - Integer.MIN_VALUE;
                Object obj = pVar.f5786x;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = pVar.f5788z;
                if (i != 0) {
                    f.r(obj);
                    H h10 = (H) aVar.f1195v;
                    f6 = h10.f((byte) 6);
                    if (h10.r() == 4) {
                        H.n(h10, "Unexpected leading comma", 0, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = pVar.f5785w;
                    linkedHashMap2 = pVar.f5784v;
                    aVar2 = pVar.f5783u;
                    C4933b c4933b2 = pVar.f5782n;
                    f.r(obj);
                    linkedHashMap2.put(str, (l) obj);
                    b9 = ((H) aVar2.f1195v).e();
                    if (b9 != 4) {
                        if (b9 != 7) {
                            H.n((H) aVar2.f1195v, "Expected end of the object or comma", 0, 6);
                            throw null;
                        }
                        H h11 = (H) aVar2.f1195v;
                        if (b9 != 6) {
                            h11.f((byte) 7);
                        } else if (b9 == 4) {
                            m.e(h11, "object");
                            throw null;
                        }
                        return new y(linkedHashMap2);
                    }
                    f6 = b9;
                    aVar = aVar2;
                    linkedHashMap = linkedHashMap2;
                    c4933b = c4933b2;
                }
                h9 = (H) aVar.f1195v;
                if (h9.b()) {
                    byte b10 = f6;
                    aVar2 = aVar;
                    b9 = b10;
                    linkedHashMap2 = linkedHashMap;
                    H h112 = (H) aVar2.f1195v;
                    if (b9 != 6) {
                    }
                    return new y(linkedHashMap2);
                }
                String i9 = h9.i();
                h9.f((byte) 5);
                pVar.f5782n = c4933b;
                pVar.f5783u = aVar;
                pVar.f5784v = linkedHashMap;
                pVar.f5785w = i9;
                pVar.f5788z = 1;
                c4933b.getClass();
                c4933b.f40155u = pVar;
                return enumC5179a;
            }
        }
        pVar = new p(aVar, abstractC5217a);
        Object obj2 = pVar.f5786x;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = pVar.f5788z;
        if (i != 0) {
        }
        h9 = (H) aVar.f1195v;
        if (h9.b()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC4550i b() {
        C0324j c0324j = (C0324j) this.f1195v;
        DialogInterfaceC4550i dialogInterfaceC4550i = new DialogInterfaceC4550i((ContextThemeWrapper) c0324j.f2067v, this.f1194u);
        View view = (View) c0324j.f2071z;
        C4549h c4549h = dialogInterfaceC4550i.f38112y;
        if (view != null) {
            c4549h.f38100n = view;
        } else {
            CharSequence charSequence = (CharSequence) c0324j.f2070y;
            if (charSequence != null) {
                c4549h.f38091d = charSequence;
                TextView textView = c4549h.f38098l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = (Drawable) c0324j.f2069x;
            if (drawable != null) {
                c4549h.f38096j = drawable;
                ImageView imageView = c4549h.f38097k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c4549h.f38097k.setImageDrawable(drawable);
                }
            }
        }
        if (c0324j.f2063B != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) ((LayoutInflater) c0324j.f2068w).inflate(c4549h.f38104r, (ViewGroup) null);
            int i = c0324j.f2065n ? c4549h.f38105s : c4549h.f38106t;
            Object obj = c0324j.f2063B;
            ?? r72 = obj;
            if (obj == null) {
                r72 = new C4548g((ContextThemeWrapper) c0324j.f2067v, i, R.id.text1, null);
            }
            c4549h.f38101o = r72;
            c4549h.f38102p = c0324j.f2066u;
            if (((DialogInterface.OnClickListener) c0324j.f2064C) != null) {
                alertController$RecycleListView.setOnItemClickListener(new C4546e(c0324j, c4549h));
            }
            if (c0324j.f2065n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c4549h.f38092e = alertController$RecycleListView;
        }
        dialogInterfaceC4550i.setCancelable(true);
        dialogInterfaceC4550i.setCanceledOnTouchOutside(true);
        dialogInterfaceC4550i.setOnCancelListener(null);
        dialogInterfaceC4550i.setOnDismissListener(null);
        l.m mVar = (l.m) c0324j.f2062A;
        if (mVar != null) {
            dialogInterfaceC4550i.setOnKeyListener(mVar);
        }
        return dialogInterfaceC4550i;
    }

    public void c(int i, int i4) {
        int i9 = i4 + i;
        char[] cArr = (char[]) this.f1195v;
        if (cArr.length <= i9) {
            int i10 = i * 2;
            if (i9 < i10) {
                i9 = i10;
            }
            char[] copyOf = Arrays.copyOf(cArr, i9);
            h.d(copyOf, "copyOf(...)");
            this.f1195v = copyOf;
        }
    }

    public boolean d() {
        return ((C4589b) this.f1195v) != null;
    }

    public void e(int i, u8.c cVar) {
        while (true) {
            int i4 = i >> 1;
            if (i4 == 0) {
                break;
            }
            u8.c cVar2 = ((u8.c[]) this.f1195v)[i4];
            h.b(cVar2);
            if (h.g(0L, cVar.f41326c - cVar2.f41326c) <= 0) {
                break;
            }
            cVar2.f41270f = i;
            ((u8.c[]) this.f1195v)[i] = cVar2;
            i = i4;
        }
        ((u8.c[]) this.f1195v)[i] = cVar;
        cVar.f41270f = i;
    }

    @Override // P.u
    public boolean f(View view) {
        ((BottomSheetBehavior) this.f1195v).B(this.f1194u);
        return true;
    }

    @Override // G1.c
    public x g(x xVar, s1.h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) xVar.get()).compress((Bitmap.CompressFormat) this.f1195v, this.f1194u, byteArrayOutputStream);
        xVar.a();
        return new C(byteArrayOutputStream.toByteArray());
    }

    @Override // u2.e
    public /* synthetic */ void h(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.f1194u);
        jsonWriter.endObject();
        u2.f.d(jsonWriter, (Map) this.f1195v);
        jsonWriter.endObject();
    }

    public l i() {
        l yVar;
        Object obj;
        H h9 = (H) this.f1195v;
        byte r9 = h9.r();
        if (r9 == 1) {
            return k(true);
        }
        if (r9 == 0) {
            return k(false);
        }
        if (r9 != 6) {
            if (r9 == 8) {
                return j();
            }
            H.n(h9, "Cannot read Json element because of unexpected ".concat(m.j(r9)), 0, 6);
            throw null;
        }
        int i = this.f1194u + 1;
        this.f1194u = i;
        if (i == 200) {
            o oVar = new o(this, null);
            EnumC5179a enumC5179a = AbstractC4932a.f40153a;
            C4933b c4933b = new C4933b();
            c4933b.f40154n = oVar;
            c4933b.f40155u = c4933b;
            EnumC5179a enumC5179a2 = AbstractC4932a.f40153a;
            c4933b.f40156v = enumC5179a2;
            while (true) {
                obj = c4933b.f40156v;
                InterfaceC5133d interfaceC5133d = c4933b.f40155u;
                if (interfaceC5133d == null) {
                    break;
                }
                if (h.a(enumC5179a2, obj)) {
                    try {
                        o oVar2 = c4933b.f40154n;
                        kotlin.jvm.internal.u.b(3, oVar2);
                        o oVar3 = new o(oVar2.f5781w, interfaceC5133d);
                        oVar3.f5780v = c4933b;
                        Object invokeSuspend = oVar3.invokeSuspend(v.f40183a);
                        if (invokeSuspend != EnumC5179a.f41704n) {
                            interfaceC5133d.resumeWith(invokeSuspend);
                        }
                    } catch (Throwable th) {
                        interfaceC5133d.resumeWith(f.e(th));
                    }
                } else {
                    c4933b.f40156v = enumC5179a2;
                    interfaceC5133d.resumeWith(obj);
                }
            }
            f.r(obj);
            yVar = (l) obj;
        } else {
            byte f6 = h9.f((byte) 6);
            if (h9.r() == 4) {
                H.n(h9, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!h9.b()) {
                    break;
                }
                String i4 = h9.i();
                h9.f((byte) 5);
                linkedHashMap.put(i4, i());
                f6 = h9.e();
                if (f6 != 4) {
                    if (f6 != 7) {
                        H.n(h9, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (f6 == 6) {
                h9.f((byte) 7);
            } else if (f6 == 4) {
                m.e(h9, "object");
                throw null;
            }
            yVar = new y(linkedHashMap);
        }
        this.f1194u--;
        return yVar;
    }

    public b8.e j() {
        H h9 = (H) this.f1195v;
        byte e6 = h9.e();
        if (h9.r() == 4) {
            H.n(h9, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (h9.b()) {
            arrayList.add(i());
            e6 = h9.e();
            if (e6 != 4) {
                boolean z8 = e6 == 9;
                int i = h9.f491u;
                if (!z8) {
                    H.n(h9, "Expected end of the array or comma", i, 4);
                    throw null;
                }
            }
        }
        if (e6 == 8) {
            h9.f((byte) 9);
        } else if (e6 == 4) {
            m.e(h9, "array");
            throw null;
        }
        return new b8.e(arrayList);
    }

    public b8.C k(boolean z8) {
        H h9 = (H) this.f1195v;
        String k6 = !z8 ? h9.k() : h9.i();
        return (z8 || !h.a(k6, "null")) ? new s(k6, z8) : b8.v.INSTANCE;
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public void mo7l(Object obj) {
        switch (this.f1193n) {
            case 9:
                String a9 = i.a(this.f1194u);
                j.f39798C.f39810k.getClass();
                ((C3002bo) ((C2518Df) this.f1195v).f24456x).c(a9, System.currentTimeMillis());
                break;
            default:
                String str = (String) obj;
                C3386iu c3386iu = (C3386iu) this.f1195v;
                Ut ut = c3386iu.f32019a;
                if (!ut.f28155i0) {
                    c3386iu.f32021c.b(str, ut.f28184x0, c3386iu.f32023e, null);
                    break;
                } else {
                    String str2 = c3386iu.f32020b.f28491b;
                    C4250yv c4250yv = c3386iu.f32022d;
                    c4250yv.getClass();
                    j.f39798C.f39810k.getClass();
                    C3614n5 c3614n5 = new C3614n5(str2, str, this.f1194u, System.currentTimeMillis());
                    C2834Vp c2834Vp = c4250yv.f35424a;
                    c2834Vp.getClass();
                    c2834Vp.a(new C2593Hm(9, c2834Vp, c3614n5));
                    break;
                }
        }
    }

    public void m() {
        c8.b bVar = c8.b.f5764c;
        char[] array = (char[]) this.f1195v;
        bVar.getClass();
        h.e(array, "array");
        synchronized (bVar) {
            int i = bVar.f5765a;
            if (array.length + i < c8.a.f5763a) {
                bVar.f5765a = i + array.length;
                ((C4977h) bVar.f5766b).addLast(array);
            }
        }
    }

    public void n(u8.c node) {
        u8.c cVar;
        h.e(node, "node");
        int i = node.f41270f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i4 = this.f1194u;
        u8.c cVar2 = ((u8.c[]) this.f1195v)[i4];
        h.b(cVar2);
        node.f41270f = -1;
        ((u8.c[]) this.f1195v)[i4] = null;
        this.f1194u = i4 - 1;
        if (node == cVar2) {
            return;
        }
        int g9 = h.g(0L, cVar2.f41326c - node.f41326c);
        if (g9 == 0) {
            ((u8.c[]) this.f1195v)[i] = cVar2;
            cVar2.f41270f = i;
            return;
        }
        if (g9 >= 0) {
            e(i, cVar2);
            return;
        }
        while (true) {
            int i9 = i << 1;
            int i10 = i9 + 1;
            int i11 = this.f1194u;
            if (i10 > i11) {
                if (i9 > i11) {
                    break;
                }
                cVar = ((u8.c[]) this.f1195v)[i9];
                h.b(cVar);
            } else {
                cVar = ((u8.c[]) this.f1195v)[i9];
                h.b(cVar);
                u8.c cVar3 = ((u8.c[]) this.f1195v)[i10];
                h.b(cVar3);
                if (h.g(0L, cVar3.f41326c - cVar.f41326c) >= 0) {
                    cVar = cVar3;
                }
            }
            if (h.g(0L, cVar.f41326c - cVar2.f41326c) <= 0) {
                break;
            }
            int i12 = cVar.f41270f;
            cVar.f41270f = i;
            ((u8.c[]) this.f1195v)[i] = cVar;
            i = i12;
        }
        ((u8.c[]) this.f1195v)[i] = cVar2;
        cVar2.f41270f = i;
    }

    public void o(String text) {
        h.e(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        c(this.f1194u, length);
        text.getChars(0, text.length(), (char[]) this.f1195v, this.f1194u);
        this.f1194u += length;
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public String p(ArrayList arrayList) {
        char c4;
        int i;
        char c9 = 5;
        int i4 = 1;
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        ?? r52 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            sb.append(((String) arrayList.get(i9)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        C2959b c2959b = new C2959b(15);
        int i10 = this.f1194u;
        PriorityQueue priorityQueue = new PriorityQueue(i10, c2959b);
        int i11 = 0;
        while (i11 < split.length) {
            String[] B8 = AbstractC3217fl.B(split[i11], r52);
            if (B8.length != 0) {
                int length = B8.length;
                if (length >= 6) {
                    long H6 = PA.H(B8, 6);
                    i = i4;
                    PA.r(i10, H6, PA.B(B8, r52, 6), 6, priorityQueue);
                    long j9 = H6;
                    int i12 = i;
                    while (true) {
                        int length2 = B8.length;
                        if (i12 >= length2 - 5) {
                            break;
                        }
                        int c10 = AbstractC3217fl.c(B8[i12 - 1]);
                        long c11 = AbstractC3217fl.c(B8[i12 + 5]);
                        String B9 = PA.B(B8, i12, 6);
                        long C7 = (((c11 + 2147483647L) % 1073807359) + (((((j9 + 1073807359) - ((((c10 + 2147483647L) % 1073807359) * PA.C(5, 16785407L)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                        PA.r(i10, C7, B9, length2, priorityQueue);
                        split = split;
                        j9 = C7;
                        i12++;
                        c9 = 5;
                    }
                } else {
                    PA.r(i10, PA.H(B8, length), PA.B(B8, r52, length), length, priorityQueue);
                    i = i4;
                }
                c4 = c9;
            } else {
                c4 = c9;
                i = i4;
            }
            i11++;
            split = split;
            c9 = c4;
            i4 = i;
            r52 = 0;
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(((C8) this.f1195v).v1(((D8) it.next()).f24345b));
            } catch (IOException e6) {
                int i13 = t2.C.f40822b;
                u2.i.d("Error while writing hash to byteStream", e6);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e9) {
            int i14 = t2.C.f40822b;
            u2.i.d("HashManager: Unable to convert to Base64.", e9);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e10) {
            int i15 = t2.C.f40822b;
            u2.i.d("HashManager: Unable to convert to Base64.", e10);
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
        switch (this.f1193n) {
            case 9:
                break;
            default:
                j.f39798C.f39808h.d("BufferingUrlPinger.attributionReportingManager", th);
                break;
        }
    }

    public void r() {
        int i = this.f1194u;
        long[] jArr = (long[]) this.f1195v;
        if (i == jArr.length) {
            this.f1195v = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = (long[]) this.f1195v;
        int i4 = this.f1194u;
        this.f1194u = i4 + 1;
        jArr2[i4] = 0;
    }

    @Override // h3.InterfaceC4567a
    public Object s(n nVar) {
        if (!nVar.i()) {
            return Boolean.FALSE;
        }
        C3119dx c3119dx = (C3119dx) nVar.g();
        byte[] b9 = ((C3561m6) ((C3347i6) this.f1195v).j()).b();
        c3119dx.getClass();
        q qVar = new q(c3119dx, b9);
        qVar.f1060b = this.f1194u;
        qVar.b();
        return Boolean.TRUE;
    }

    public void t(int i, byte[] bArr) {
        int i4 = 1777080124;
        int i9 = 1777080124;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        char c4 = 0;
        int i22 = 0;
        char c9 = 0;
        char c10 = 0;
        while (true) {
            if (i9 == 719824015) {
                int i23 = (-235787554) + i9;
                i9 += 799411447;
                if (i10 == i11) {
                    i9 = i23;
                }
            } else if (i9 == 1519235462) {
                int[] iArr = (int[]) this.f1195v;
                i12 += (((i13 << i14) ^ (i13 >>> i15)) + i13) ^ (i10 + iArr[i10 & i16]);
                i10 += i17;
                i13 += (iArr[(i10 >>> i18) & i16] + i10) ^ (((i12 << i14) ^ (i12 >>> i15)) + i12);
                i9 -= 799411447;
            } else {
                if (i9 != i4) {
                    bArr[0] = (byte) (i12 >> i19);
                    bArr[1] = (byte) ((((i12 >> i20) & i21) << i19) >> i19);
                    bArr[c4] = (byte) ((((i12 >> i22) & i21) << i19) >> i19);
                    bArr[i16] = (byte) (((i12 & i21) << i19) >> i19);
                    bArr[i14] = (byte) (i13 >> i19);
                    bArr[i15] = (byte) ((((i13 >> i20) & i21) << i19) >> i19);
                    bArr[c9] = (byte) ((((i13 >> i22) & i21) << i19) >> i19);
                    bArr[c10] = (byte) (((i13 & i21) << i19) >> i19);
                    return;
                }
                i9 -= 1057256109;
                i12 = this.f1194u;
                i16 = 3;
                i21 = com.anythink.basead.exoplayer.k.p.f8630b;
                c10 = 7;
                c9 = 6;
                c4 = 2;
                i19 = 24;
                i18 = 11;
                i17 = 1340169305;
                i15 = 5;
                i14 = 4;
                i11 = -64255200;
                i20 = 16;
                i22 = 8;
                i13 = i;
                i10 = 0;
            }
            i4 = 1777080124;
        }
    }

    public String toString() {
        switch (this.f1193n) {
            case 3:
                return new String((char[]) this.f1195v, 0, this.f1194u);
            case 6:
                TC tc = (TC) this.f1195v;
                ArrayList arrayList = new ArrayList(tc.f27727u);
                for (int i = 0; i < tc.f27727u; i++) {
                    arrayList.add(AbstractC3548lu.a(tc.a(i)));
                }
                String a9 = AbstractC3548lu.a(this.f1194u);
                String obj = arrayList.toString();
                StringBuilder sb = new StringBuilder(AbstractC5051n.a(a9.length() + 37, 1, obj));
                sb.append("UnsupportedBrands{major=");
                sb.append(a9);
                sb.append(", compatible=");
                sb.append(obj);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public long v(J0 j02) {
        int i;
        Lr lr = (Lr) this.f1195v;
        int i4 = 0;
        j02.I(lr.f26233a, 0, 1, false);
        int i9 = lr.f26233a[0] & 255;
        if (i9 == 0) {
            return Long.MIN_VALUE;
        }
        int i10 = 128;
        int i11 = 0;
        while (true) {
            i = i11 + 1;
            if ((i9 & i10) != 0) {
                break;
            }
            i10 >>= 1;
            i11 = i;
        }
        int i12 = i9 & (~i10);
        j02.I(lr.f26233a, 1, i11, false);
        while (i4 < i11) {
            i4++;
            i12 = (lr.f26233a[i4] & 255) + (i12 << 8);
        }
        this.f1194u += i;
        return i12;
    }

    public void w(long[] jArr) {
        int i = this.f1194u;
        int length = jArr.length;
        int i4 = i + length;
        long[] jArr2 = (long[]) this.f1195v;
        int length2 = jArr2.length;
        if (i4 > length2) {
            this.f1195v = Arrays.copyOf(jArr2, Math.max(length2 + length2, i4));
        }
        System.arraycopy(jArr, 0, (long[]) this.f1195v, this.f1194u, length);
        this.f1194u = i4;
    }

    public long x(int i) {
        if (i >= 0 && i < this.f1194u) {
            return ((long[]) this.f1195v)[i];
        }
        int i4 = this.f1194u;
        throw new IndexOutOfBoundsException(D.y.n(new StringBuilder(String.valueOf(i).length() + 24 + String.valueOf(i4).length()), "Invalid index ", i, ", size is ", i4));
    }

    public /* synthetic */ a(int i, Object obj, int i4) {
        this.f1193n = i4;
        this.f1194u = i;
        this.f1195v = obj;
    }

    public /* synthetic */ a(Object obj, int i, int i4) {
        this.f1193n = i4;
        this.f1195v = obj;
        this.f1194u = i;
    }

    public a(boolean z8, boolean z9, boolean z10) {
        this.f1193n = 14;
        int i = 1;
        if (!z8 && !z9 && !z10) {
            i = 0;
        }
        this.f1194u = i;
    }

    public a(int i, int i4) {
        this.f1193n = i4;
        switch (i4) {
            case 10:
                this.f1195v = new long[i];
                break;
            default:
                this.f1195v = new C8(2);
                this.f1194u = i;
                break;
        }
    }

    public a(int i, int i4, int[] iArr) {
        TC tc;
        this.f1193n = i4;
        switch (i4) {
            case 7:
                int length = iArr.length;
                if (length == 4) {
                    this.f1194u = i;
                    this.f1195v = iArr;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder(CL.b(length, 44));
                    sb.append(I5.a("Ake3rgkWMjm+UlOd1Tg3PHccqBbIRJQk3bhyKj5k"));
                    sb.append(length);
                    sb.append(I5.a("a0CvvBEaN339T0zNlXk="));
                    throw new IllegalArgumentException(sb.toString());
                }
            default:
                this.f1194u = i;
                if (iArr != null) {
                    int[] copyOf = Arrays.copyOf(iArr, iArr.length);
                    tc = new TC(copyOf, copyOf.length);
                } else {
                    tc = TC.f27725v;
                }
                this.f1195v = tc;
                return;
        }
    }

    public a(L2.b bVar, int i) {
        this.f1193n = 2;
        w.h(bVar);
        this.f1195v = bVar;
        this.f1194u = i;
    }

    public a(C2518Df c2518Df, int i) {
        this.f1193n = 9;
        this.f1194u = i;
        Objects.requireNonNull(c2518Df);
        this.f1195v = c2518Df;
    }

    public a(C3386iu c3386iu, int i) {
        this.f1193n = 12;
        this.f1194u = i;
        Objects.requireNonNull(c3386iu);
        this.f1195v = c3386iu;
    }

    public a(b8.j jVar, H h9) {
        this.f1193n = 4;
        this.f1195v = h9;
    }

    public a(byte b9, int i) {
        this.f1193n = i;
        switch (i) {
            case 5:
                this.f1195v = new Lr(8);
                break;
            case 16:
                this.f1194u = com.anythink.basead.exoplayer.k.p.f8630b;
                this.f1195v = null;
                break;
            default:
                this.f1195v = Bitmap.CompressFormat.JPEG;
                this.f1194u = 100;
                break;
        }
    }

    public a(Context context) {
        this.f1193n = 15;
        int e6 = DialogInterfaceC4550i.e(context, 0);
        this.f1195v = new C0324j(new ContextThemeWrapper(context, DialogInterfaceC4550i.e(context, e6)));
        this.f1194u = e6;
    }

    private final void u(Throwable th) {
    }
}
