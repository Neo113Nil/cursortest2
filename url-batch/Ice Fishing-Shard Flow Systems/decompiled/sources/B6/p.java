package B6;

import A6.C;
import A6.y;
import R5.AbstractC0161a;
import R5.AbstractC0162b;
import R5.C0163c;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import h4.C0480A;
import i.C0517d;
import i.C0518e;
import i.C0520g;
import i.C0521h;
import i.DialogInterfaceC0522i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.C0633l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232a;

    /* renamed from: b, reason: collision with root package name */
    public int f233b;

    /* renamed from: c, reason: collision with root package name */
    public Object f234c;

    public /* synthetic */ p(int i2, byte b7) {
        this.f232a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p pVar, AbstractC0162b abstractC0162b, X5.a aVar) {
        r frame;
        int i2;
        byte f7;
        LinkedHashMap linkedHashMap;
        v vVar;
        LinkedHashMap linkedHashMap2;
        p pVar2;
        byte b7;
        v vVar2 = (v) pVar.f234c;
        if (aVar instanceof r) {
            frame = (r) aVar;
            int i5 = frame.f244o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                frame.f244o = i5 - Integer.MIN_VALUE;
                Object obj = frame.f242m;
                W5.a aVar2 = W5.a.f2787d;
                i2 = frame.f244o;
                if (i2 != 0) {
                    V6.b.P(obj);
                    f7 = vVar2.f((byte) 6);
                    if (vVar2.p() == 4) {
                        v.m(vVar2, "Unexpected leading comma", 0, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = frame.f241l;
                    linkedHashMap2 = frame.f240i;
                    pVar2 = frame.f239e;
                    AbstractC0162b abstractC0162b2 = frame.f238d;
                    V6.b.P(obj);
                    linkedHashMap2.put(str, (A6.l) obj);
                    b7 = ((v) pVar2.f234c).e();
                    if (b7 != 4) {
                        if (b7 != 7) {
                            v.m((v) pVar2.f234c, "Expected end of the object or comma", 0, 6);
                            throw null;
                        }
                        v vVar3 = (v) pVar2.f234c;
                        if (b7 != 6) {
                            vVar3.f((byte) 7);
                        } else if (b7 == 4) {
                            m.f(vVar3, "object");
                            throw null;
                        }
                        return new y(linkedHashMap2);
                    }
                    f7 = b7;
                    pVar = pVar2;
                    linkedHashMap = linkedHashMap2;
                    abstractC0162b = abstractC0162b2;
                }
                vVar = (v) pVar.f234c;
                if (vVar.b()) {
                    linkedHashMap2 = linkedHashMap;
                    pVar2 = pVar;
                    b7 = f7;
                    v vVar32 = (v) pVar2.f234c;
                    if (b7 != 6) {
                    }
                    return new y(linkedHashMap2);
                }
                String i7 = vVar.i();
                vVar.f((byte) 5);
                Unit unit = Unit.f6114a;
                frame.f238d = abstractC0162b;
                frame.f239e = pVar;
                frame.f240i = linkedHashMap;
                frame.f241l = i7;
                frame.f244o = 1;
                C0163c c0163c = (C0163c) abstractC0162b;
                c0163c.getClass();
                c0163c.f2412i = frame;
                c0163c.f2411e = unit;
                Intrinsics.checkNotNullParameter(frame, "frame");
                return aVar2;
            }
        }
        frame = new r(pVar, aVar);
        Object obj2 = frame.f242m;
        W5.a aVar22 = W5.a.f2787d;
        i2 = frame.f244o;
        if (i2 != 0) {
        }
        vVar = (v) pVar.f234c;
        if (vVar.b()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public DialogInterfaceC0522i b() {
        C0518e c0518e = (C0518e) this.f234c;
        DialogInterfaceC0522i dialogInterfaceC0522i = new DialogInterfaceC0522i(c0518e.f5417a, this.f233b);
        View view = c0518e.f5421e;
        C0521h c0521h = dialogInterfaceC0522i.f5466n;
        if (view != null) {
            c0521h.f5460w = view;
        } else {
            CharSequence charSequence = c0518e.f5420d;
            if (charSequence != null) {
                c0521h.f5442d = charSequence;
                TextView textView = c0521h.f5458u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0518e.f5419c;
            if (drawable != null) {
                c0521h.f5456s = drawable;
                ImageView imageView = c0521h.f5457t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0521h.f5457t.setImageDrawable(drawable);
                }
            }
        }
        String str = c0518e.f5422f;
        if (str != null) {
            c0521h.f5443e = str;
            TextView textView2 = c0521h.f5459v;
            if (textView2 != null) {
                textView2.setText(str);
            }
        }
        CharSequence charSequence2 = c0518e.f5423g;
        if (charSequence2 != null) {
            c0521h.c(-1, charSequence2, c0518e.f5424h);
        }
        CharSequence charSequence3 = c0518e.f5425i;
        if (charSequence3 != null) {
            c0521h.c(-2, charSequence3, c0518e.j);
        }
        if (c0518e.f5428m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0518e.f5418b.inflate(c0521h.f5433A, (ViewGroup) null);
            int i2 = c0518e.f5430o ? c0521h.f5434B : c0521h.f5435C;
            Object obj = c0518e.f5428m;
            ?? r7 = obj;
            if (obj == null) {
                r7 = new C0520g(c0518e.f5417a, i2, R.id.text1, null);
            }
            c0521h.f5461x = r7;
            c0521h.f5462y = c0518e.f5431p;
            if (c0518e.f5429n != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0517d(c0518e, c0521h));
            }
            if (c0518e.f5430o) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0521h.f5444f = alertController$RecycleListView;
        }
        dialogInterfaceC0522i.setCancelable(true);
        dialogInterfaceC0522i.setCanceledOnTouchOutside(true);
        dialogInterfaceC0522i.setOnCancelListener(c0518e.f5426k);
        dialogInterfaceC0522i.setOnDismissListener(null);
        m.n nVar = c0518e.f5427l;
        if (nVar != null) {
            dialogInterfaceC0522i.setOnKeyListener(nVar);
        }
        return dialogInterfaceC0522i;
    }

    public void c(int i2, int i5) {
        int i7 = i5 + i2;
        char[] cArr = (char[]) this.f234c;
        if (cArr.length <= i7) {
            int i8 = i2 * 2;
            if (i7 < i8) {
                i7 = i8;
            }
            char[] copyOf = Arrays.copyOf(cArr, i7);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f234c = copyOf;
        }
    }

    public void d(int i2, T6.d dVar) {
        while (true) {
            int i5 = i2 >> 1;
            if (i5 == 0) {
                break;
            }
            T6.d dVar2 = ((T6.d[]) this.f234c)[i5];
            Intrinsics.b(dVar2);
            if (Intrinsics.e(0L, dVar.f2658c - dVar2.f2658c) <= 0) {
                break;
            }
            dVar2.f2610f = i2;
            ((T6.d[]) this.f234c)[i2] = dVar2;
            i2 = i5;
        }
        ((T6.d[]) this.f234c)[i2] = dVar;
        dVar.f2610f = i2;
    }

    public A6.l e() {
        A6.l yVar;
        Object obj;
        Object invoke;
        v vVar = (v) this.f234c;
        byte p7 = vVar.p();
        if (p7 == 1) {
            return g(true);
        }
        if (p7 == 0) {
            return g(false);
        }
        if (p7 != 6) {
            if (p7 == 8) {
                return f();
            }
            v.m(vVar, "Cannot read Json element because of unexpected ".concat(m.k(p7)), 0, 6);
            throw null;
        }
        int i2 = this.f233b + 1;
        this.f233b = i2;
        if (i2 == 200) {
            q block = new q(this, null);
            q1.h hVar = new q1.h(block);
            Unit unit = Unit.f6114a;
            W5.a aVar = AbstractC0161a.f2409a;
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            C0163c c0163c = new C0163c(null);
            c0163c.f2410d = block;
            c0163c.f2411e = unit;
            c0163c.f2412i = c0163c;
            W5.a aVar2 = AbstractC0161a.f2409a;
            c0163c.f2413l = aVar2;
            while (true) {
                obj = c0163c.f2413l;
                V5.b completion = c0163c.f2412i;
                if (completion == null) {
                    break;
                }
                R5.l lVar = R5.n.f2421d;
                if (Intrinsics.a(aVar2, obj)) {
                    try {
                        q qVar = c0163c.f2410d;
                        Unit unit2 = c0163c.f2411e;
                        if (qVar == null) {
                            Intrinsics.checkNotNullParameter(qVar, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext context = completion.getContext();
                            Object bVar = context == kotlin.coroutines.g.f6146d ? new W5.b(completion) : new W5.c(completion, context);
                            I.b(3, qVar);
                            invoke = qVar.invoke(c0163c, unit2, bVar);
                        } else {
                            I.b(3, qVar);
                            invoke = qVar.invoke(c0163c, unit2, completion);
                        }
                        if (invoke != W5.a.f2787d) {
                            completion.resumeWith(invoke);
                        }
                    } catch (Throwable th) {
                        R5.l lVar2 = R5.n.f2421d;
                        completion.resumeWith(V6.b.n(th));
                    }
                } else {
                    c0163c.f2413l = aVar2;
                    completion.resumeWith(obj);
                }
            }
            V6.b.P(obj);
            yVar = (A6.l) obj;
        } else {
            byte f7 = vVar.f((byte) 6);
            if (vVar.p() == 4) {
                v.m(vVar, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!vVar.b()) {
                    break;
                }
                String i5 = vVar.i();
                vVar.f((byte) 5);
                linkedHashMap.put(i5, e());
                f7 = vVar.e();
                if (f7 != 4) {
                    if (f7 != 7) {
                        v.m(vVar, "Expected end of the object or comma", 0, 6);
                        throw null;
                    }
                }
            }
            if (f7 == 6) {
                vVar.f((byte) 7);
            } else if (f7 == 4) {
                m.f(vVar, "object");
                throw null;
            }
            yVar = new y(linkedHashMap);
        }
        this.f233b--;
        return yVar;
    }

    public A6.e f() {
        v vVar = (v) this.f234c;
        byte e7 = vVar.e();
        if (vVar.p() == 4) {
            v.m(vVar, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (vVar.b()) {
            arrayList.add(e());
            e7 = vVar.e();
            if (e7 != 4) {
                boolean z7 = e7 == 9;
                int i2 = vVar.f259b;
                if (!z7) {
                    v.m(vVar, "Expected end of the array or comma", i2, 4);
                    throw null;
                }
            }
        }
        if (e7 == 8) {
            vVar.f((byte) 9);
        } else if (e7 == 4) {
            m.f(vVar, "array");
            throw null;
        }
        return new A6.e(arrayList);
    }

    public C g(boolean z7) {
        v vVar = (v) this.f234c;
        String j = !z7 ? vVar.j() : vVar.i();
        return (z7 || !Intrinsics.a(j, "null")) ? new A6.s(j, z7) : A6.v.INSTANCE;
    }

    public void h() {
        b bVar = b.f214c;
        char[] array = (char[]) this.f234c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (bVar) {
            try {
                int i2 = bVar.f215a;
                if (array.length + i2 < a.f213a) {
                    bVar.f215a = i2 + array.length;
                    ((C0633l) bVar.f216b).addLast(array);
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(T6.d node) {
        T6.d dVar;
        Intrinsics.checkNotNullParameter(node, "node");
        int i2 = node.f2610f;
        if (i2 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i5 = this.f233b;
        T6.d dVar2 = ((T6.d[]) this.f234c)[i5];
        Intrinsics.b(dVar2);
        node.f2610f = -1;
        ((T6.d[]) this.f234c)[i5] = null;
        this.f233b = i5 - 1;
        if (node == dVar2) {
            return;
        }
        int e7 = Intrinsics.e(0L, dVar2.f2658c - node.f2658c);
        if (e7 == 0) {
            ((T6.d[]) this.f234c)[i2] = dVar2;
            dVar2.f2610f = i2;
            return;
        }
        if (e7 >= 0) {
            d(i2, dVar2);
            return;
        }
        while (true) {
            int i7 = i2 << 1;
            int i8 = i7 + 1;
            int i9 = this.f233b;
            if (i8 > i9) {
                if (i7 > i9) {
                    break;
                }
                dVar = ((T6.d[]) this.f234c)[i7];
                Intrinsics.b(dVar);
            } else {
                dVar = ((T6.d[]) this.f234c)[i7];
                Intrinsics.b(dVar);
                T6.d dVar3 = ((T6.d[]) this.f234c)[i8];
                Intrinsics.b(dVar3);
                if (Intrinsics.e(0L, dVar3.f2658c - dVar.f2658c) >= 0) {
                    dVar = dVar3;
                }
            }
            if (Intrinsics.e(0L, dVar.f2658c - dVar2.f2658c) <= 0) {
                break;
            }
            int i10 = dVar.f2610f;
            dVar.f2610f = i2;
            ((T6.d[]) this.f234c)[i2] = dVar;
            i2 = i10;
        }
        ((T6.d[]) this.f234c)[i2] = dVar2;
        dVar2.f2610f = i2;
    }

    public void j(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        c(this.f233b, length);
        text.getChars(0, text.length(), (char[]) this.f234c, this.f233b);
        this.f233b += length;
    }

    public String toString() {
        switch (this.f232a) {
            case 0:
                return new String((char[]) this.f234c, 0, this.f233b);
            default:
                return super.toString();
        }
    }

    public p(A6.j configuration, v lexer) {
        this.f232a = 1;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f234c = lexer;
    }

    public p(int i2, C0480A[] c0480aArr) {
        this.f232a = 6;
        this.f233b = i2;
        this.f234c = c0480aArr;
    }

    public p(int i2) {
        this.f232a = 3;
        if (i2 > 0) {
            this.f234c = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        this(context, DialogInterfaceC0522i.e(context, 0));
        this.f232a = 7;
    }

    public p(Context context, int i2) {
        this.f232a = 7;
        this.f234c = new C0518e(new ContextThemeWrapper(context, DialogInterfaceC0522i.e(context, i2)));
        this.f233b = i2;
    }

    public p() {
        this.f232a = 2;
        this.f233b = 1;
        this.f234c = Collections.singletonList(null);
    }

    public p(ArrayList routes, int i2) {
        this.f232a = i2;
        switch (i2) {
            case 4:
                Intrinsics.checkNotNullParameter(routes, "routes");
                this.f234c = routes;
                break;
            default:
                this.f233b = 0;
                this.f234c = routes;
                break;
        }
    }
}
