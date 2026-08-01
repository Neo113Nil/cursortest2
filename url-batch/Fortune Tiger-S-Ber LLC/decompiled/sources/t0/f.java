package t0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f extends m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3371a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3372b;
    public boolean c = true;

    public f(TextView textView) {
        this.f3371a = textView;
        this.f3372b = new d(textView);
    }

    public final void D() {
        TextView textView = this.f3371a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f3376f;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // m0.a
    public final InputFilter[] k(InputFilter[] inputFilterArr) {
        if (!this.c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof d) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (sparseArray.indexOfKey(i6) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i6];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i7 = 0;
        while (true) {
            d dVar = this.f3372b;
            if (i7 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i7] == dVar) {
                return inputFilterArr;
            }
            i7++;
        }
    }

    @Override // m0.a
    public final void x(boolean z3) {
        if (z3) {
            D();
        }
    }

    @Override // m0.a
    public final void y(boolean z3) {
        this.c = z3;
        D();
        TextView textView = this.f3371a;
        textView.setFilters(k(textView.getFilters()));
    }
}
