package U;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f9342a;

    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f9343a;

        /* renamed from: b, reason: collision with root package name */
        private final d f9344b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9345c = true;

        a(TextView textView) {
            this.f9343a = textView;
            this.f9344b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f9344b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f9344b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof d) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray g4 = g(inputFilterArr);
            if (g4.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g4.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (g4.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f9343a.setFilters(a(this.f9343a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new h(transformationMethod);
        }

        @Override // U.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f9345c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // U.f.b
        public boolean b() {
            return this.f9345c;
        }

        @Override // U.f.b
        void c(boolean z4) {
            if (z4) {
                l();
            }
        }

        @Override // U.f.b
        void d(boolean z4) {
            this.f9345c = z4;
            l();
            k();
        }

        @Override // U.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f9345c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z4) {
            this.f9345c = z4;
        }

        void l() {
            this.f9343a.setTransformationMethod(e(this.f9343a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z4);

        abstract void d(boolean z4);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f9346a;

        c(TextView textView) {
            this.f9346a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.i();
        }

        @Override // U.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f9346a.a(inputFilterArr);
        }

        @Override // U.f.b
        public boolean b() {
            return this.f9346a.b();
        }

        @Override // U.f.b
        void c(boolean z4) {
            if (f()) {
                return;
            }
            this.f9346a.c(z4);
        }

        @Override // U.f.b
        void d(boolean z4) {
            if (f()) {
                this.f9346a.i(z4);
            } else {
                this.f9346a.d(z4);
            }
        }

        @Override // U.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f9346a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z4) {
        A.h.g(textView, "textView cannot be null");
        if (z4) {
            this.f9342a = new a(textView);
        } else {
            this.f9342a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f9342a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f9342a.b();
    }

    public void c(boolean z4) {
        this.f9342a.c(z4);
    }

    public void d(boolean z4) {
        this.f9342a.d(z4);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f9342a.e(transformationMethod);
    }
}
