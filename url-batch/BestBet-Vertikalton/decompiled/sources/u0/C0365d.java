package u0;

import K.InterfaceC0020p;
import K.u0;
import K.w0;
import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import c.C0083a;
import com.fortunequest.neontrack.data.FortuneQuestDatabase_Impl;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d1.AbstractC0095c;
import g0.C0136F;
import g0.h0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import q.C0308d;
import q.C0310f;
import v.C0388b;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365d implements InterfaceC0020p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4174a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4175b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4176c;

    public /* synthetic */ C0365d(Object obj, int i, Object obj2) {
        this.f4174a = i;
        this.f4175b = obj;
        this.f4176c = obj2;
    }

    public static int c(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public View a(int i, int i2, int i3, int i4) {
        View u2;
        C0136F c0136f = (C0136F) this.f4175b;
        int d = c0136f.d();
        int c2 = c0136f.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c0136f.f2719a) {
                case 0:
                    u2 = c0136f.f2720b.u(i);
                    break;
                default:
                    u2 = c0136f.f2720b.u(i);
                    break;
            }
            int b2 = c0136f.b(u2);
            int a2 = c0136f.a(u2);
            h0 h0Var = (h0) this.f4176c;
            h0Var.f2852b = d;
            h0Var.f2853c = c2;
            h0Var.d = b2;
            h0Var.f2854e = a2;
            if (i3 != 0) {
                h0Var.f2851a = i3;
                if (h0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                h0Var.f2851a = i4;
                if (h0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public Object b(long j2, AbstractC0095c abstractC0095c) {
        h0.p a2 = h0.p.a("SELECT * FROM completions WHERE dayEpoch = ?", 1);
        a2.n(1, j2);
        return h0.e.a((FortuneQuestDatabase_Impl) this.f4175b, new CancellationSignal(), new CallableC0364c(this, a2, 0), abstractC0095c);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.InterfaceC0020p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w0 d(View view, w0 w0Var) {
        boolean z2;
        boolean z3;
        L0.n nVar = (L0.n) this.f4176c;
        int i = nVar.f779a;
        C0.d dVar = (C0.d) this.f4175b;
        u0 u0Var = w0Var.f668a;
        C.d f2 = u0Var.f(7);
        C.d f3 = u0Var.f(32);
        int i2 = f2.f69b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) dVar.f92b;
        bottomSheetBehavior.f2193w = i2;
        boolean e2 = L0.k.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f2185o;
        if (z4) {
            int a2 = w0Var.a();
            bottomSheetBehavior.f2192v = a2;
            paddingBottom = a2 + nVar.f781c;
        }
        int i3 = nVar.f780b;
        boolean z5 = bottomSheetBehavior.f2186p;
        int i4 = f2.f68a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f2187q;
        int i5 = f2.f70c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f2189s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f2190t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f2191u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f69b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = dVar.f91a;
                if (z3) {
                    bottomSheetBehavior.f2183m = f3.d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.I();
                }
                return w0Var;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = dVar.f91a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return w0Var;
    }

    public void e() {
        ((SparseIntArray) this.f4175b).clear();
    }

    public boolean f(View view) {
        C0136F c0136f = (C0136F) this.f4175b;
        int d = c0136f.d();
        int c2 = c0136f.c();
        int b2 = c0136f.b(view);
        int a2 = c0136f.a(view);
        h0 h0Var = (h0) this.f4176c;
        h0Var.f2852b = d;
        h0Var.f2853c = c2;
        h0Var.d = b2;
        h0Var.f2854e = a2;
        h0Var.f2851a = 24579;
        return h0Var.a();
    }

    public void g(H.h hVar) {
        int i = hVar.f493b;
        Handler handler = (Handler) this.f4176c;
        A0.c cVar = (A0.c) this.f4175b;
        if (i == 0) {
            handler.post(new H.a(cVar, 0, hVar.f492a));
        } else {
            handler.post(new H.b(cVar, i, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        v.i iVar;
        char c2;
        v.n nVar = new v.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    iVar = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (XmlPullParserException e3) {
                    e3.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c3 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f4368a = true;
                                    break;
                                case 3:
                                    iVar = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVar.d.f4381h0 = 1;
                                    break;
                                case 4:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f4338b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f4340e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVar.f4339c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (iVar == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0388b.a(context, xmlResourceParser, iVar.f4341f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                ((SparseArray) this.f4176c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4430c.put(Integer.valueOf(iVar.f4337a), iVar);
                                iVar = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f4176c).put(identifier, nVar);
                return;
            }
        }
    }

    public void i() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f4175b;
        jVar.getClass();
        String str = (String) this.f4176c;
        k1.e.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1571b.remove(str)) != null) {
            jVar.f1570a.remove(num);
        }
        jVar.f1573e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1574f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1575g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = G.a.a(bundle, str, C0083a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0083a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0083a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1572c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public String toString() {
        switch (this.f4174a) {
            case 9:
                String str = "[ ";
                if (((C0310f) this.f4175b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0310f) this.f4175b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0310f) this.f4175b);
            default:
                return super.toString();
        }
    }

    public C0365d(FortuneQuestDatabase_Impl fortuneQuestDatabase_Impl) {
        this.f4174a = 0;
        this.f4175b = fortuneQuestDatabase_Impl;
        this.f4176c = new C0362a(fortuneQuestDatabase_Impl, 0);
    }

    public C0365d(C0308d c0308d) {
        this.f4174a = 9;
        this.f4176c = c0308d;
    }

    public C0365d(C0136F c0136f) {
        this.f4174a = 8;
        this.f4175b = c0136f;
        h0 h0Var = new h0();
        h0Var.f2851a = 0;
        this.f4176c = h0Var;
    }

    public C0365d(Animation animation) {
        this.f4174a = 5;
        this.f4175b = animation;
        this.f4176c = null;
    }

    public C0365d(Animator animator) {
        this.f4174a = 5;
        this.f4175b = null;
        this.f4176c = animator;
    }

    public C0365d(ArrayList arrayList, ArrayList arrayList2) {
        this.f4174a = 1;
        int size = arrayList.size();
        this.f4175b = new int[size];
        this.f4176c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f4175b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f4176c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0365d(int i, int i2) {
        this.f4174a = 1;
        this.f4175b = new int[]{i, i2};
        this.f4176c = new float[]{RecyclerView.f1937A0, 1.0f};
    }

    public C0365d(int i, int i2, int i3) {
        this.f4174a = 1;
        this.f4175b = new int[]{i, i2, i3};
        this.f4176c = new float[]{RecyclerView.f1937A0, 0.5f, 1.0f};
    }

    public C0365d(EditText editText) {
        this.f4174a = 4;
        this.f4175b = editText;
        W.i iVar = new W.i(editText);
        this.f4176c = iVar;
        editText.addTextChangedListener(iVar);
        if (W.a.f1247b == null) {
            synchronized (W.a.f1246a) {
                try {
                    if (W.a.f1247b == null) {
                        W.a aVar = new W.a();
                        try {
                            W.a.f1248c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, W.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        W.a.f1247b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(W.a.f1247b);
    }

    public C0365d(int i) {
        this.f4174a = i;
        switch (i) {
            case 10:
                break;
            default:
                this.f4175b = new SparseIntArray();
                this.f4176c = new SparseIntArray();
                break;
        }
    }
}
