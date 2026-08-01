package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class EG extends AbstractC0991Yy {
    public static TimeInterpolator A0B;
    public static String[] A0C = {"K3xavpXOVVnTPS8V8FmisIpuez1NdmFn", "QjoCrUVtXYT15qNhmppxWCsnlOvXMRWn", "HVYav4KnfeU3lAWSFDiSVAYelCZD7hW1", "SKhwmHHGUoQzTLK2kw5WKB1efbL3jYLm", "aZpNXGptJoOcjVlsPlgA0RFw1bcc4fI1", "y8DDj9eTKGlZyxtiH83YwnquX80t2qUq", "Eqht3urb", "PkOCx2w9GPXTa0iGANdHxOJetOGxrMw0"};
    public ArrayList<AbstractC02504u> A0A = new ArrayList<>();
    public ArrayList<AbstractC02504u> A07 = new ArrayList<>();
    public ArrayList<C4A> A09 = new ArrayList<>();
    public ArrayList<AnonymousClass49> A08 = new ArrayList<>();
    public ArrayList<ArrayList<AbstractC02504u>> A01 = new ArrayList<>();
    public ArrayList<ArrayList<C4A>> A05 = new ArrayList<>();
    public ArrayList<ArrayList<AnonymousClass49>> A03 = new ArrayList<>();
    public ArrayList<AbstractC02504u> A00 = new ArrayList<>();
    public ArrayList<AbstractC02504u> A04 = new ArrayList<>();
    public ArrayList<AbstractC02504u> A06 = new ArrayList<>();
    public ArrayList<AbstractC02504u> A02 = new ArrayList<>();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.C4Y
    public final void A0I() {
        for (int size = this.A09.size() - 1; size >= 0; size--) {
            C4A c4a = this.A09.get(size);
            View view = c4a.A04.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0O(c4a.A04);
            this.A09.remove(size);
        }
        for (int size2 = this.A0A.size() - 1; size2 >= 0; size2--) {
            A0P(this.A0A.get(size2));
            this.A0A.remove(size2);
        }
        for (int size3 = this.A07.size() - 1; size3 >= 0; size3--) {
            AbstractC02504u abstractC02504u = this.A07.get(size3);
            abstractC02504u.A0H.setAlpha(1.0f);
            A0N(abstractC02504u);
            this.A07.remove(size3);
        }
        for (int size4 = this.A08.size() - 1; size4 >= 0; size4--) {
            A01(this.A08.get(size4));
        }
        this.A08.clear();
        if (A0L()) {
            for (int size5 = this.A05.size() - 1; size5 >= 0; size5--) {
                ArrayList<C4A> arrayList = this.A05.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C4A c4a2 = arrayList.get(size6);
                    View view2 = c4a2.A04.A0H;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    A0O(c4a2.A04);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.A05.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.A01.size() - 1; size7 >= 0; size7--) {
                ArrayList<AbstractC02504u> arrayList2 = this.A01.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    AbstractC02504u abstractC02504u2 = arrayList2.get(size8);
                    abstractC02504u2.A0H.setAlpha(1.0f);
                    A0N(abstractC02504u2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.A01.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.A03.size() - 1; size9 >= 0; size9--) {
                ArrayList<AnonymousClass49> arrayList3 = this.A03.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    A01(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.A03.remove(arrayList3);
                    }
                }
            }
            A05(this.A06);
            A05(this.A04);
            A05(this.A00);
            A05(this.A02);
            A0A();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0991Yy
    public final boolean A0T(AbstractC02504u abstractC02504u, int i, int i2, int i3, int i4) {
        View view = abstractC02504u.A0H;
        int translationX = i + ((int) abstractC02504u.A0H.getTranslationX());
        int translationY = i2 + ((int) abstractC02504u.A0H.getTranslationY());
        A04(abstractC02504u);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            A0O(abstractC02504u);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.A09.add(new C4A(abstractC02504u, translationX, translationY, i3, i4));
        return true;
    }

    private void A01(AnonymousClass49 anonymousClass49) {
        if (anonymousClass49.A05 != null) {
            A07(anonymousClass49, anonymousClass49.A05);
        }
        if (anonymousClass49.A04 != null) {
            A07(anonymousClass49, anonymousClass49.A04);
        }
    }

    private void A03(final AbstractC02504u abstractC02504u) {
        final View view = abstractC02504u.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A06.add(abstractC02504u);
        ViewPropertyAnimator animation = animate.setDuration(A07());
        animation.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.44
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                view.setAlpha(1.0f);
                EG.this.A0P(abstractC02504u);
                EG.this.A06.remove(abstractC02504u);
                EG.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    private void A04(AbstractC02504u abstractC02504u) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        abstractC02504u.A0H.animate().setInterpolator(A0B);
        A0K(abstractC02504u);
    }

    private final void A05(List<AbstractC02504u> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).A0H.animate().cancel();
        }
    }

    private void A06(List<AnonymousClass49> list, AbstractC02504u abstractC02504u) {
        for (int size = list.size() - 1; size >= 0; size--) {
            AnonymousClass49 changeInfo = list.get(size);
            if (A07(changeInfo, abstractC02504u) && changeInfo.A05 == null && changeInfo.A04 == null) {
                list.remove(changeInfo);
            }
        }
    }

    private boolean A07(AnonymousClass49 anonymousClass49, AbstractC02504u abstractC02504u) {
        boolean z = false;
        if (anonymousClass49.A04 == abstractC02504u) {
            anonymousClass49.A04 = null;
        } else if (anonymousClass49.A05 == abstractC02504u) {
            anonymousClass49.A05 = null;
            z = true;
        } else {
            return false;
        }
        abstractC02504u.A0H.setAlpha(1.0f);
        abstractC02504u.A0H.setTranslationX(0.0f);
        abstractC02504u.A0H.setTranslationY(0.0f);
        A0Q(abstractC02504u, z);
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0033 */
    @Override // com.facebook.ads.redexgen.X.C4Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0J() {
        boolean z = !this.A0A.isEmpty();
        boolean removalsPending = this.A09.isEmpty();
        boolean z2 = !removalsPending;
        boolean removalsPending2 = this.A08.isEmpty();
        boolean z3 = !removalsPending2;
        boolean removalsPending3 = this.A07.isEmpty();
        boolean z4 = !removalsPending3;
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<AbstractC02504u> it = this.A0A.iterator();
        while (removalsPending) {
            A03(it.next());
        }
        this.A0A.clear();
        if (z2) {
            final ArrayList<C4A> arrayList = new ArrayList<>();
            arrayList.addAll(this.A09);
            this.A05.add(arrayList);
            this.A09.clear();
            Runnable runnable = new Runnable() { // from class: com.facebook.ads.redexgen.X.41
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C4A c4a = (C4A) it2.next();
                        EG.this.A0Y(c4a.A04, c4a.A00, c4a.A01, c4a.A02, c4a.A03);
                    }
                    arrayList.clear();
                    EG.this.A05.remove(arrayList);
                }
            };
            if (z) {
                C3H.A0E(arrayList.get(0).A04.A0H, runnable, A07());
            } else {
                runnable.run();
            }
        }
        if (z3) {
            final ArrayList<AnonymousClass49> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.A08);
            this.A03.add(arrayList2);
            this.A08.clear();
            Runnable runnable2 = new Runnable() { // from class: com.facebook.ads.redexgen.X.42
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass49 change = (AnonymousClass49) it2.next();
                        EG.this.A0W(change);
                    }
                    arrayList2.clear();
                    EG.this.A03.remove(arrayList2);
                }
            };
            if (z) {
                C3H.A0E(arrayList2.get(0).A05.A0H, runnable2, A07());
            } else {
                runnable2.run();
            }
        }
        if (z4) {
            final ArrayList<AbstractC02504u> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.A07);
            this.A01.add(arrayList3);
            this.A07.clear();
            Runnable runnable3 = new Runnable() { // from class: com.facebook.ads.redexgen.X.43
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        AbstractC02504u holder = (AbstractC02504u) it2.next();
                        EG.this.A0X(holder);
                    }
                    arrayList3.clear();
                    EG.this.A01.remove(arrayList3);
                }
            };
            if (!z && !z2 && !z3) {
                runnable3.run();
                return;
            }
            if (A0C[0].charAt(3) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[4] = "oGS3g0YSOogxL8fDiPQ9wWzcLRV8E0qu";
            strArr[3] = "UwBhVdK7HoWqzQqehBBKiWd5H5AJwN9O";
            C3H.A0E(arrayList3.get(0).A0H, runnable3, Math.max(z2 ? A06() : 0L, z3 ? A05() : 0L) + (z ? A07() : 0L));
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final void A0K(AbstractC02504u abstractC02504u) {
        View view = abstractC02504u.A0H;
        view.animate().cancel();
        for (int i = this.A09.size() - 1; i >= 0; i--) {
            if (this.A09.get(i).A04 == abstractC02504u) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0O(abstractC02504u);
                this.A09.remove(i);
            }
        }
        A06(this.A08, abstractC02504u);
        if (this.A0A.remove(abstractC02504u)) {
            view.setAlpha(1.0f);
            A0P(abstractC02504u);
        }
        if (this.A07.remove(abstractC02504u)) {
            view.setAlpha(1.0f);
            A0N(abstractC02504u);
        }
        for (int i2 = this.A03.size() - 1; i2 >= 0; i2--) {
            ArrayList<AnonymousClass49> arrayList = this.A03.get(i2);
            A06(arrayList, abstractC02504u);
            if (arrayList.isEmpty()) {
                this.A03.remove(i2);
            }
        }
        for (int j = this.A05.size() - 1; j >= 0; j--) {
            ArrayList<C4A> arrayList2 = this.A05.get(j);
            int size = arrayList2.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (arrayList2.get(size).A04 == abstractC02504u) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    String[] strArr = A0C;
                    String str = strArr[4];
                    String str2 = strArr[3];
                    int i3 = str.charAt(9);
                    if (i3 != str2.charAt(9)) {
                        throw new RuntimeException();
                    }
                    A0C[1] = "ZnQkkSK02m4qlFQsfXGc8k1uWyp7aRL1";
                    A0O(abstractC02504u);
                    arrayList2.remove(size);
                    if (arrayList2.isEmpty()) {
                        this.A05.remove(j);
                    }
                } else {
                    size--;
                }
            }
        }
        int size2 = this.A01.size();
        if (A0C[0].charAt(3) == 'S') {
            throw new RuntimeException();
        }
        A0C[7] = "NHib0yCpDtVNZGbvtAXjIsv6RzrfBwwf";
        for (int i4 = size2 - 1; i4 >= 0; i4--) {
            ArrayList<AbstractC02504u> arrayList3 = this.A01.get(i4);
            if (arrayList3.remove(abstractC02504u)) {
                view.setAlpha(1.0f);
                A0N(abstractC02504u);
                if (arrayList3.isEmpty()) {
                    this.A01.remove(i4);
                }
            }
        }
        this.A06.remove(abstractC02504u);
        this.A00.remove(abstractC02504u);
        this.A02.remove(abstractC02504u);
        this.A04.remove(abstractC02504u);
        A0V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r3 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r4.A02.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r4.A05.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r4.A01.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
    
        r3 = r4.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (com.facebook.ads.redexgen.X.EG.A0C[7].charAt(30) == 'w') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        com.facebook.ads.redexgen.X.EG.A0C[7] = "80rjjAfjuSoUPBYOWBOUrC4mhnJBtDwK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r3.isEmpty() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r3 != false) goto L20;
     */
    @Override // com.facebook.ads.redexgen.X.C4Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0L() {
        if (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty()) {
            boolean isEmpty = this.A04.isEmpty();
            String[] strArr = A0C;
            if (strArr[2].charAt(18) != strArr[5].charAt(18)) {
                String[] strArr2 = A0C;
                strArr2[4] = "HATKbuX1ioRbKjbJza4uRkbMkwnilInw";
                strArr2[3] = "55W5G9gSwoJRpeM2nuMk9rdzPBhIsXI5";
                if (isEmpty && this.A06.isEmpty()) {
                    boolean isEmpty2 = this.A00.isEmpty();
                    String[] strArr3 = A0C;
                    if (strArr3[2].charAt(18) != strArr3[5].charAt(18)) {
                        A0C[7] = "PBqWGImhwZdo7IXQpaNFK9QlBHxMp4wk";
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4Y
    public final boolean A0M(AbstractC02504u abstractC02504u, List<Object> payloads) {
        return !payloads.isEmpty() || super.A0M(abstractC02504u, payloads);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0991Yy
    public final boolean A0R(AbstractC02504u abstractC02504u) {
        A04(abstractC02504u);
        abstractC02504u.A0H.setAlpha(0.0f);
        this.A07.add(abstractC02504u);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0991Yy
    public final boolean A0S(AbstractC02504u abstractC02504u) {
        A04(abstractC02504u);
        this.A0A.add(abstractC02504u);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0991Yy
    public final boolean A0U(AbstractC02504u abstractC02504u, AbstractC02504u abstractC02504u2, int i, int i2, int i3, int i4) {
        if (abstractC02504u == abstractC02504u2) {
            return A0T(abstractC02504u, i, i2, i3, i4);
        }
        float translationX = abstractC02504u.A0H.getTranslationX();
        float translationY = abstractC02504u.A0H.getTranslationY();
        float prevTranslationY = abstractC02504u.A0H.getAlpha();
        A04(abstractC02504u);
        float prevTranslationX = i3 - i;
        int deltaY = (int) (prevTranslationX - translationX);
        float prevTranslationX2 = i4 - i2;
        int deltaX = (int) (prevTranslationX2 - translationY);
        abstractC02504u.A0H.setTranslationX(translationX);
        abstractC02504u.A0H.setTranslationY(translationY);
        abstractC02504u.A0H.setAlpha(prevTranslationY);
        if (abstractC02504u2 != null) {
            A04(abstractC02504u2);
            float prevTranslationX3 = -deltaY;
            abstractC02504u2.A0H.setTranslationX(prevTranslationX3);
            float prevTranslationX4 = -deltaX;
            abstractC02504u2.A0H.setTranslationY(prevTranslationX4);
            abstractC02504u2.A0H.setAlpha(0.0f);
        }
        this.A08.add(new AnonymousClass49(abstractC02504u, abstractC02504u2, i, i2, i3, i4));
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }

    public final void A0W(final AnonymousClass49 anonymousClass49) {
        final View view;
        AbstractC02504u holder = anonymousClass49.A05;
        if (holder == null) {
            view = null;
        } else {
            view = holder.A0H;
        }
        AbstractC02504u holder2 = anonymousClass49.A04;
        final View view2 = holder2 != null ? holder2.A0H : null;
        if (view != null) {
            final ViewPropertyAnimator oldViewAnim = view.animate().setDuration(A05());
            this.A02.add(anonymousClass49.A05);
            oldViewAnim.translationX(anonymousClass49.A02 - anonymousClass49.A00);
            oldViewAnim.translationY(anonymousClass49.A03 - anonymousClass49.A01);
            oldViewAnim.alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.47
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    oldViewAnim.setListener(null);
                    view.setAlpha(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    EG.this.A0Q(anonymousClass49.A05, true);
                    EG.this.A02.remove(anonymousClass49.A05);
                    EG.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator animate = view2.animate();
            this.A02.add(anonymousClass49.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A05()).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.48
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    EG.this.A0Q(anonymousClass49.A04, false);
                    EG.this.A02.remove(anonymousClass49.A04);
                    EG.this.A0V();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            }).start();
        }
    }

    public final void A0X(final AbstractC02504u abstractC02504u) {
        final View view = abstractC02504u.A0H;
        final ViewPropertyAnimator animate = view.animate();
        this.A00.add(abstractC02504u);
        ViewPropertyAnimator animation = animate.alpha(1.0f).setDuration(A04());
        animation.setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.45
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                EG.this.A0N(abstractC02504u);
                EG.this.A00.remove(abstractC02504u);
                EG.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }

    public final void A0Y(final AbstractC02504u abstractC02504u, int i, int i2, int i3, int i4) {
        final View view = abstractC02504u.A0H;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        final ViewPropertyAnimator animate = view.animate();
        this.A04.add(abstractC02504u);
        animate.setDuration(A06()).setListener(new AnimatorListenerAdapter() { // from class: com.facebook.ads.redexgen.X.46
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i6 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                animate.setListener(null);
                EG.this.A0O(abstractC02504u);
                EG.this.A04.remove(abstractC02504u);
                EG.this.A0V();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        }).start();
    }
}
