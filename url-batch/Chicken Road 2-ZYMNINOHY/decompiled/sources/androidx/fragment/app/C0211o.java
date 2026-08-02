package androidx.fragment.app;

import E.AbstractC0005f;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.rockchicken.pump.up.road.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211o {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4935a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4936b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4937c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4938d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4939e;

    public C0211o(ViewGroup container) {
        kotlin.jvm.internal.i.e(container, "container");
        this.f4935a = container;
        this.f4936b = new ArrayList();
        this.f4937c = new ArrayList();
    }

    public static void f(p.e eVar, View view) {
        Field field = E.H.f375a;
        String c4 = E.A.c(view);
        if (c4 != null) {
            eVar.put(c4, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    f(eVar, childAt);
                }
            }
        }
    }

    public static final C0211o j(ViewGroup container, f0 fragmentManager) {
        kotlin.jvm.internal.i.e(container, "container");
        kotlin.jvm.internal.i.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.i.d(fragmentManager.H(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0211o) {
            return (C0211o) tag;
        }
        C0211o c0211o = new C0211o(container);
        container.setTag(R.id.special_effects_controller_view_tag, c0211o);
        return c0211o;
    }

    public static void m(p.e eVar, Collection collection) {
        Set entrySet = eVar.entrySet();
        F3.g gVar = new F3.g(2, collection);
        Iterator it = ((androidx.datastore.preferences.protobuf.b0) entrySet).iterator();
        while (it.hasNext()) {
            if (!((Boolean) gVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public final void a(B0 operation) {
        kotlin.jvm.internal.i.e(operation, "operation");
        if (operation.f4731i) {
            int i4 = operation.f4723a;
            View requireView = operation.f4725c.requireView();
            kotlin.jvm.internal.i.d(requireView, "operation.fragment.requireView()");
            AbstractC0005f.a(i4, requireView, this.f4935a);
            operation.f4731i = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0489, code lost:
    
        if (androidx.fragment.app.f0.J(r16) == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x048b, code lost:
    
        android.util.Log.v(r0, "Ignoring Animator set on " + r7 + " as this Fragment was involved in a Transition.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0477, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04b8, code lost:
    
        r3 = r1.size();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04c0, code lost:
    
        if (r15 >= r3) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04c2, code lost:
    
        r4 = r1.get(r15);
        r15 = r15 + 1;
        r4 = (androidx.fragment.app.C0202f) r4;
        r5 = r4.f4893a;
        r7 = r5.f4725c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04d0, code lost:
    
        if (r2 != false) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04ed, code lost:
    
        if (r9 == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x050a, code lost:
    
        r5.f4732j.add(new androidx.fragment.app.C0201e(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x04f3, code lost:
    
        if (androidx.fragment.app.f0.J(r16) == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x04f5, code lost:
    
        android.util.Log.v(r0, "Ignoring Animation set on " + r7 + " as Animations cannot run alongside Animators.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04d6, code lost:
    
        if (androidx.fragment.app.f0.J(r16) == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04d8, code lost:
    
        android.util.Log.v(r0, "Ignoring Animation set on " + r7 + " as Animations cannot run alongside Transitions.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0515, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01bc, code lost:
    
        r1 = new java.util.ArrayList();
        r8 = new java.util.ArrayList();
        r9 = new p.e(0);
        r12 = new java.util.ArrayList<>();
        r13 = new java.util.ArrayList<>();
        r17 = r12;
        r12 = new p.e(0);
        r18 = r13;
        r13 = new p.e(0);
        r11 = r6.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ea, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ec, code lost:
    
        if (r15 >= r11) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ee, code lost:
    
        r20 = r6.get(r15);
        r15 = r15 + 1;
        r10 = ((androidx.fragment.app.C0210n) r20).f4930d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01fa, code lost:
    
        if (r10 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01fc, code lost:
    
        if (r3 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01fe, code lost:
    
        r20 = r1;
        r1 = r3.f4725c;
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0204, code lost:
    
        if (r4 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0206, code lost:
    
        r2 = r4.f4725c;
        r10 = r7.s(r7.f(r10));
        r22 = r7;
        r7 = r2.getSharedElementSourceNames();
        r23 = r8;
        kotlin.jvm.internal.i.d(r7, "lastIn.fragment.sharedElementSourceNames");
        r8 = r1.getSharedElementSourceNames();
        r24 = r11;
        kotlin.jvm.internal.i.d(r8, "firstOut.fragment.sharedElementSourceNames");
        r11 = r1.getSharedElementTargetNames();
        kotlin.jvm.internal.i.d(r11, "firstOut.fragment.sharedElementTargetNames");
        r14 = r11.size();
        r25 = r15;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0239, code lost:
    
        if (r15 >= r14) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x023b, code lost:
    
        r17 = r14;
        r14 = r7.indexOf(r11.get(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0245, code lost:
    
        if (r14 == (-1)) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0247, code lost:
    
        r7.set(r14, r8.get(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x024e, code lost:
    
        r15 = r15 + 1;
        r14 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0253, code lost:
    
        r8 = r2.getSharedElementTargetNames();
        kotlin.jvm.internal.i.d(r8, "lastIn.fragment.sharedElementTargetNames");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r3 = (androidx.fragment.app.B0) r11;
        r2 = r27.listIterator(r27.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x025c, code lost:
    
        if (r28 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x025e, code lost:
    
        r1.getExitTransitionCallback();
        r2.getEnterTransitionCallback();
        r11 = new c3.C0292d(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0279, code lost:
    
        if (r11.f5724a != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x027d, code lost:
    
        if (r11.f5725b != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x027f, code lost:
    
        r11 = r7.size();
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0284, code lost:
    
        if (r15 >= r11) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0286, code lost:
    
        r14 = r7.get(r15);
        kotlin.jvm.internal.i.d(r14, "exitingNames[i]");
        r0 = r8.get(r15);
        kotlin.jvm.internal.i.d(r0, "enteringNames[i]");
        r9.put(r14, r0);
        r15 = r15 + 1;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ac, code lost:
    
        if (androidx.fragment.app.f0.J(r16) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ae, code lost:
    
        android.util.Log.v("FragmentManager", ">>> entering view names <<<");
        r0 = r8.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02ba, code lost:
    
        if (r11 >= r0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02bc, code lost:
    
        r15 = r8.get(r11);
        r11 = r11 + 1;
        android.util.Log.v("FragmentManager", "Name: " + r15);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02d8, code lost:
    
        android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
        r0 = r7.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e2, code lost:
    
        if (r11 >= r0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02e4, code lost:
    
        r15 = r7.get(r11);
        r11 = r11 + 1;
        android.util.Log.v("FragmentManager", "Name: " + r15);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r2.hasPrevious() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0300, code lost:
    
        r0 = r1.mView;
        kotlin.jvm.internal.i.d(r0, "firstOut.fragment.mView");
        f(r12, r0);
        r12.l(r7);
        r9.l(r12.keySet());
        r0 = r2.mView;
        kotlin.jvm.internal.i.d(r0, "lastIn.fragment.mView");
        f(r13, r0);
        r13.l(r8);
        r13.l(r9.values());
        r0 = androidx.fragment.app.p0.f4951a;
        r0 = r9.f14667c - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x032f, code lost:
    
        if ((-1) >= r0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x033b, code lost:
    
        if (r13.containsKey((java.lang.String) r9.i(r0)) != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x033d, code lost:
    
        r9.g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0340, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        r11 = r2.previous();
        r12 = (androidx.fragment.app.B0) r11;
        r13 = r12.f4725c.mView;
        kotlin.jvm.internal.i.d(r13, "operation.fragment.mView");
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0343, code lost:
    
        m(r12, r9.keySet());
        m(r13, r9.values());
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0355, code lost:
    
        if (r9.isEmpty() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0399, code lost:
    
        r18 = r7;
        r17 = r8;
        r19 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a3, code lost:
    
        r1 = r20;
        r2 = r21;
        r7 = r22;
        r8 = r23;
        r11 = r24;
        r15 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0357, code lost:
    
        android.util.Log.i("FragmentManager", "Ignoring shared elements transition " + r10 + " between " + r3 + " and " + r4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
        r20.clear();
        r23.clear();
        r18 = r7;
        r17 = r8;
        r1 = r20;
        r2 = r21;
        r7 = r22;
        r8 = r23;
        r11 = r24;
        r15 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03b6, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r13.getAlpha() != 0.0f) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03bc, code lost:
    
        throw new java.lang.ClassCastException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x026b, code lost:
    
        r1.getEnterTransitionCallback();
        r2.getExitTransitionCallback();
        r11 = new c3.C0292d(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03bd, code lost:
    
        r22 = r7;
        r23 = r8;
        r24 = r11;
        r25 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c6, code lost:
    
        r20 = r1;
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03d0, code lost:
    
        r20 = r1;
        r21 = r2;
        r22 = r7;
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03d8, code lost:
    
        if (r19 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03de, code lost:
    
        if (r6.isEmpty() == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03e0, code lost:
    
        r0 = "FragmentManager";
        r15 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03e4, code lost:
    
        r0 = r6.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03e9, code lost:
    
        if (r1 >= r0) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03eb, code lost:
    
        r2 = r6.get(r1);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03f5, code lost:
    
        if (((androidx.fragment.app.C0210n) r2).f4928b != null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r13.getVisibility() != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03f8, code lost:
    
        r0 = "FragmentManager";
        r15 = r21;
        r1 = new androidx.fragment.app.C0209m(r6, r3, r4, r22, r19, r20, r23, r9, r17, r18, r12, r13, r28);
        r3 = r6.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0414, code lost:
    
        if (r4 >= r3) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0416, code lost:
    
        r5 = r6.get(r4);
        r4 = r4 + 1;
        ((androidx.fragment.app.C0210n) r5).f4893a.f4732j.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x007f, code lost:
    
        r13 = r13.getVisibility();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0083, code lost:
    
        if (r13 == 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0085, code lost:
    
        if (r13 == 4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0087, code lost:
    
        if (r13 != 8) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0093, code lost:
    
        throw new java.lang.IllegalArgumentException(E.AbstractC0005f.j(r13, "Unknown visibility "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0099, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r12.f4723a != 2) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        if (androidx.fragment.app.f0.J(2) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        android.util.Log.v("FragmentManager", "Executing operations from " + r3 + " to " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        r2 = new java.util.ArrayList();
        r6 = new java.util.ArrayList();
        r7 = ((androidx.fragment.app.B0) d3.i.h0(r27)).f4725c;
        r8 = r27.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        if (r11 >= r8) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
    
        r12 = r27.get(r11);
        r11 = r11 + 1;
        r12 = ((androidx.fragment.app.B0) r12).f4725c.mAnimationInfo;
        r13 = r7.mAnimationInfo;
        r12.f4736b = r13.f4736b;
        r12.f4737c = r13.f4737c;
        r12.f4738d = r13.f4738d;
        r12.f4739e = r13.f4739e;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fa, code lost:
    
        r16 = r9;
        r7 = r27.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
    
        if (r8 >= r7) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        r11 = r27.get(r8);
        r8 = r8 + 1;
        r11 = (androidx.fragment.app.B0) r11;
        r2.add(new androidx.fragment.app.C0202f(r11, r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0116, code lost:
    
        if (r28 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
    
        if (r11 != r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011a, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
    
        r6.add(new androidx.fragment.app.C0210n(r11, r28, r13));
        r11.f4726d.add(new androidx.fragment.app.z0(r26, r11, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011c, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
    
        if (r11 != r4) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        r1 = new java.util.ArrayList();
        r7 = r6.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
    
        if (r8 >= r7) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013e, code lost:
    
        r11 = r6.get(r8);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
    
        if (((androidx.fragment.app.C0210n) r11).a() != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014d, code lost:
    
        r1.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0151, code lost:
    
        r6 = new java.util.ArrayList();
        r7 = r1.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015b, code lost:
    
        if (r8 >= r7) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
    
        r11 = r1.get(r8);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016a, code lost:
    
        if (((androidx.fragment.app.C0210n) r11).b() == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
    
        r6.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0170, code lost:
    
        r1 = r6.size();
        r8 = 0;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        if (r8 >= r1) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0178, code lost:
    
        r11 = r6.get(r8);
        r8 = r8 + 1;
        r11 = (androidx.fragment.app.C0210n) r11;
        r12 = r11.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0184, code lost:
    
        if (r7 == null) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
    
        if (r12 != r7) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b3, code lost:
    
        throw new java.lang.IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + r11.f4893a.f4725c + " returned Transition " + r11.f4928b + " which uses a different Transition type than other Fragments.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b6, code lost:
    
        if (r7 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b8, code lost:
    
        r15 = r2;
        r0 = "FragmentManager";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0426, code lost:
    
        r1 = new java.util.ArrayList();
        r2 = new java.util.ArrayList();
        r3 = r15.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0435, code lost:
    
        if (r4 >= r3) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0437, code lost:
    
        r5 = r15.get(r4);
        r4 = r4 + 1;
        d3.o.Z(r2, ((androidx.fragment.app.C0202f) r5).f4893a.f4733k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0447, code lost:
    
        r2 = r2.isEmpty();
        r3 = r15.size();
        r4 = 0;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0451, code lost:
    
        if (r4 >= r3) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0453, code lost:
    
        r5 = r15.get(r4);
        r4 = r4 + 1;
        r5 = (androidx.fragment.app.C0202f) r5;
        r7 = r26.f4935a.getContext();
        r8 = r5.f4893a;
        kotlin.jvm.internal.i.d(r7, "context");
        r7 = r5.b(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x046e, code lost:
    
        if (r7 != null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0475, code lost:
    
        if (((android.animation.AnimatorSet) r7.f4761b) != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x047b, code lost:
    
        r7 = r8.f4725c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0483, code lost:
    
        if (r8.f4733k.isEmpty() != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04a5, code lost:
    
        if (r8.f4723a != 3) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x04a7, code lost:
    
        r8.f4731i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x04ac, code lost:
    
        r8.f4732j.add(new androidx.fragment.app.C0204h(r5));
        r9 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 2;
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i5);
            i5++;
            B0 b02 = (B0) obj;
            View view = b02.f4725c.mView;
            kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(AbstractC0005f.j(visibility, "Unknown visibility "));
                    }
                } else if (b02.f4723a != 2) {
                    break;
                }
            }
        }
    }

    public final void c(List operations) {
        kotlin.jvm.internal.i.e(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = operations.iterator();
        while (it.hasNext()) {
            d3.o.Z(arrayList, ((B0) it.next()).f4733k);
        }
        List n02 = d3.i.n0(d3.i.p0(arrayList));
        int size = n02.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((A0) n02.get(i4)).c(this.f4935a);
        }
        int size2 = operations.size();
        for (int i5 = 0; i5 < size2; i5++) {
            a((B0) operations.get(i5));
        }
        List n03 = d3.i.n0(operations);
        int size3 = n03.size();
        for (int i6 = 0; i6 < size3; i6++) {
            B0 b02 = (B0) n03.get(i6);
            if (b02.f4733k.isEmpty()) {
                b02.b();
            }
        }
    }

    public final void d(int i4, int i5, m0 m0Var) {
        synchronized (this.f4936b) {
            try {
                F f4 = m0Var.f4925c;
                kotlin.jvm.internal.i.d(f4, "fragmentStateManager.fragment");
                B0 g4 = g(f4);
                if (g4 == null) {
                    F f5 = m0Var.f4925c;
                    g4 = f5.mTransitioning ? h(f5) : null;
                }
                if (g4 != null) {
                    g4.d(i4, i5);
                    return;
                }
                B0 b02 = new B0(i4, i5, m0Var);
                this.f4936b.add(b02);
                b02.f4726d.add(new z0(this, b02, 0));
                b02.f4726d.add(new z0(this, b02, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016b A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:12:0x0017, B:14:0x0020, B:16:0x0031, B:18:0x003f, B:19:0x005e, B:22:0x0070, B:25:0x0074, B:29:0x006d, B:33:0x007a, B:36:0x008d, B:38:0x009b, B:39:0x00b1, B:42:0x00c8, B:45:0x00cc, B:50:0x00c3, B:51:0x00c5, B:53:0x00d2, B:57:0x00e3, B:59:0x00f3, B:60:0x00fa, B:62:0x0108, B:64:0x0118, B:66:0x011c, B:70:0x013c, B:76:0x0123, B:78:0x012a, B:87:0x0147, B:89:0x0153, B:91:0x0161, B:95:0x016b, B:96:0x018a, B:98:0x0192, B:100:0x0174, B:102:0x017e), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:12:0x0017, B:14:0x0020, B:16:0x0031, B:18:0x003f, B:19:0x005e, B:22:0x0070, B:25:0x0074, B:29:0x006d, B:33:0x007a, B:36:0x008d, B:38:0x009b, B:39:0x00b1, B:42:0x00c8, B:45:0x00cc, B:50:0x00c3, B:51:0x00c5, B:53:0x00d2, B:57:0x00e3, B:59:0x00f3, B:60:0x00fa, B:62:0x0108, B:64:0x0118, B:66:0x011c, B:70:0x013c, B:76:0x0123, B:78:0x012a, B:87:0x0147, B:89:0x0153, B:91:0x0161, B:95:0x016b, B:96:0x018a, B:98:0x0192, B:100:0x0174, B:102:0x017e), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        boolean z;
        boolean z4;
        if (this.f4939e) {
            return;
        }
        int i4 = 0;
        if (!this.f4935a.isAttachedToWindow()) {
            i();
            this.f4938d = false;
            return;
        }
        synchronized (this.f4936b) {
            try {
                if (this.f4936b.isEmpty()) {
                    ArrayList o02 = d3.i.o0(this.f4937c);
                    this.f4937c.clear();
                    int size = o02.size();
                    while (i4 < size) {
                        Object obj = o02.get(i4);
                        i4++;
                        B0 b02 = (B0) obj;
                        if (f0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + b02 + " with no incoming pendingOperations");
                        }
                        ViewGroup container = this.f4935a;
                        b02.getClass();
                        kotlin.jvm.internal.i.e(container, "container");
                        if (!b02.f4727e) {
                            b02.a(container);
                        }
                        if (!b02.f4728f) {
                            this.f4937c.add(b02);
                        }
                    }
                } else {
                    ArrayList o03 = d3.i.o0(this.f4937c);
                    this.f4937c.clear();
                    int size2 = o03.size();
                    int i5 = 0;
                    while (true) {
                        z = true;
                        if (i5 >= size2) {
                            break;
                        }
                        Object obj2 = o03.get(i5);
                        i5++;
                        B0 b03 = (B0) obj2;
                        if (f0.J(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + b03);
                        }
                        ViewGroup container2 = this.f4935a;
                        boolean z5 = b03.f4725c.mTransitioning;
                        kotlin.jvm.internal.i.e(container2, "container");
                        if (!b03.f4727e) {
                            if (z5) {
                                b03.f4729g = true;
                            }
                            b03.a(container2);
                        }
                        if (!b03.f4728f) {
                            this.f4937c.add(b03);
                        }
                    }
                    n();
                    ArrayList o04 = d3.i.o0(this.f4936b);
                    if (o04.isEmpty()) {
                        return;
                    }
                    this.f4936b.clear();
                    this.f4937c.addAll(o04);
                    if (f0.J(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(o04, this.f4938d);
                    int size3 = o04.size();
                    int i6 = 0;
                    boolean z6 = true;
                    boolean z7 = true;
                    while (i6 < size3) {
                        Object obj3 = o04.get(i6);
                        i6++;
                        B0 b04 = (B0) obj3;
                        if (!b04.f4733k.isEmpty()) {
                            ArrayList arrayList = b04.f4733k;
                            if (arrayList == null || !arrayList.isEmpty()) {
                                int size4 = arrayList.size();
                                int i7 = 0;
                                while (i7 < size4) {
                                    Object obj4 = arrayList.get(i7);
                                    i7++;
                                    if (!((A0) obj4).a()) {
                                    }
                                }
                            }
                            z4 = true;
                            if (b04.f4725c.mTransitioning) {
                                z6 = false;
                            }
                            z7 = z4;
                        }
                        z4 = false;
                        if (b04.f4725c.mTransitioning) {
                        }
                        z7 = z4;
                    }
                    if (z7) {
                        ArrayList arrayList2 = new ArrayList();
                        int size5 = o04.size();
                        int i8 = 0;
                        while (i8 < size5) {
                            Object obj5 = o04.get(i8);
                            i8++;
                            d3.o.Z(arrayList2, ((B0) obj5).f4733k);
                        }
                        if (!arrayList2.isEmpty()) {
                            if (z6) {
                                l(o04);
                                c(o04);
                            } else if (z) {
                                l(o04);
                                int size6 = o04.size();
                                for (int i9 = 0; i9 < size6; i9++) {
                                    a((B0) o04.get(i9));
                                }
                            }
                            this.f4938d = false;
                            if (f0.J(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                            }
                        }
                    }
                    z = false;
                    if (z6) {
                    }
                    this.f4938d = false;
                    if (f0.J(2)) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final B0 g(F f4) {
        Object obj;
        ArrayList arrayList = this.f4936b;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            B0 b02 = (B0) obj;
            if (kotlin.jvm.internal.i.a(b02.f4725c, f4) && !b02.f4727e) {
                break;
            }
        }
        return (B0) obj;
    }

    public final B0 h(F f4) {
        Object obj;
        ArrayList arrayList = this.f4937c;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i4);
            i4++;
            B0 b02 = (B0) obj;
            if (kotlin.jvm.internal.i.a(b02.f4725c, f4) && !b02.f4727e) {
                break;
            }
        }
        return (B0) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (f0.J(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f4935a.isAttachedToWindow();
        synchronized (this.f4936b) {
            try {
                n();
                l(this.f4936b);
                ArrayList o02 = d3.i.o0(this.f4937c);
                int size = o02.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj = o02.get(i5);
                    i5++;
                    B0 b02 = (B0) obj;
                    if (f0.J(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f4935a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + b02);
                    }
                    b02.a(this.f4935a);
                }
                ArrayList o03 = d3.i.o0(this.f4936b);
                int size2 = o03.size();
                while (i4 < size2) {
                    Object obj2 = o03.get(i4);
                    i4++;
                    B0 b03 = (B0) obj2;
                    if (f0.J(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f4935a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + b03);
                    }
                    b03.a(this.f4935a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        Object obj;
        synchronized (this.f4936b) {
            try {
                n();
                ArrayList arrayList = this.f4936b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    B0 b02 = (B0) obj;
                    View view = b02.f4725c.mView;
                    kotlin.jvm.internal.i.d(view, "operation.fragment.mView");
                    char c4 = 4;
                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c4 = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c4 = 3;
                        }
                    }
                    if (b02.f4723a == 2 && c4 != 2) {
                        break;
                    }
                }
                B0 b03 = (B0) obj;
                F f4 = b03 != null ? b03.f4725c : null;
                this.f4939e = f4 != null ? f4.isPostponed() : false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(List list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            B0 b02 = (B0) list.get(i4);
            m0 m0Var = b02.f4734l;
            if (!b02.f4730h) {
                b02.f4730h = true;
                int i5 = b02.f4724b;
                if (i5 == 2) {
                    F f4 = m0Var.f4925c;
                    kotlin.jvm.internal.i.d(f4, "fragmentStateManager.fragment");
                    View findFocus = f4.mView.findFocus();
                    if (findFocus != null) {
                        f4.setFocusedView(findFocus);
                        if (f0.J(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + f4);
                        }
                    }
                    View requireView = b02.f4725c.requireView();
                    kotlin.jvm.internal.i.d(requireView, "this.fragment.requireView()");
                    if (requireView.getParent() == null) {
                        m0Var.b();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(f4.getPostOnViewCreatedAlpha());
                } else if (i5 == 3) {
                    F f5 = m0Var.f4925c;
                    kotlin.jvm.internal.i.d(f5, "fragmentStateManager.fragment");
                    View requireView2 = f5.requireView();
                    kotlin.jvm.internal.i.d(requireView2, "fragment.requireView()");
                    if (f0.J(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + f5);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d3.o.Z(arrayList, ((B0) it.next()).f4733k);
        }
        List n02 = d3.i.n0(d3.i.p0(arrayList));
        int size2 = n02.size();
        for (int i6 = 0; i6 < size2; i6++) {
            A0 a02 = (A0) n02.get(i6);
            a02.getClass();
            ViewGroup container = this.f4935a;
            kotlin.jvm.internal.i.e(container, "container");
            if (!a02.f4716a) {
                a02.e(container);
            }
            a02.f4716a = true;
        }
    }

    public final void n() {
        ArrayList arrayList = this.f4936b;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            B0 b02 = (B0) obj;
            int i5 = 2;
            if (b02.f4724b == 2) {
                View requireView = b02.f4725c.requireView();
                kotlin.jvm.internal.i.d(requireView, "fragment.requireView()");
                int visibility = requireView.getVisibility();
                if (visibility != 0) {
                    i5 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC0005f.j(visibility, "Unknown visibility "));
                        }
                        i5 = 3;
                    }
                }
                b02.d(i5, 1);
            }
        }
    }
}
