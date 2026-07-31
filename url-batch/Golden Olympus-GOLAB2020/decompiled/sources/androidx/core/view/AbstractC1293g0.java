package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import i2.InterfaceC2471a;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* renamed from: androidx.core.view.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1293g0 {

    /* renamed from: androidx.core.view.g0$a */
    public static final class a implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f11957a;

        a(ViewGroup viewGroup) {
            this.f11957a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return AbstractC1293g0.d(this.f11957a);
        }
    }

    /* renamed from: androidx.core.view.g0$b */
    static final class b extends kotlin.jvm.internal.s implements Function1 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f11958i = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(View view) {
            Sequence b4;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (b4 = AbstractC1293g0.b(viewGroup)) == null) {
                return null;
            }
            return b4.iterator();
        }
    }

    /* renamed from: androidx.core.view.g0$c */
    public static final class c implements Iterator, InterfaceC2471a {

        /* renamed from: b, reason: collision with root package name */
        private int f11959b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup f11960c;

        c(ViewGroup viewGroup) {
            this.f11960c = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f11960c;
            int i4 = this.f11959b;
            this.f11959b = i4 + 1;
            View childAt = viewGroup.getChildAt(i4);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11959b < this.f11960c.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f11960c;
            int i4 = this.f11959b - 1;
            this.f11959b = i4;
            viewGroup.removeViewAt(i4);
        }
    }

    /* renamed from: androidx.core.view.g0$d */
    public static final class d implements Sequence {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f11961a;

        public d(ViewGroup viewGroup) {
            this.f11961a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator iterator() {
            return new W(AbstractC1293g0.b(this.f11961a).iterator(), b.f11958i);
        }
    }

    public static final View a(ViewGroup viewGroup, int i4) {
        View childAt = viewGroup.getChildAt(i4);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i4 + ", Size: " + viewGroup.getChildCount());
    }

    public static final Sequence b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final Sequence c(ViewGroup viewGroup) {
        return new d(viewGroup);
    }

    public static final Iterator d(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
