package X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends A1.d {

    /* renamed from: e, reason: collision with root package name */
    public final TextView f973e;

    /* renamed from: f, reason: collision with root package name */
    public final d f974f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f975g = true;

    public f(TextView textView) {
        this.f973e = textView;
        this.f974f = new d(textView);
    }

    @Override // A1.d
    public final InputFilter[] I(InputFilter[] inputFilterArr) {
        if (!this.f975g) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            d dVar = this.f974f;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == dVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // A1.d
    public final boolean P() {
        return this.f975g;
    }

    @Override // A1.d
    public final void c0(boolean z2) {
        if (z2) {
            TextView textView = this.f973e;
            textView.setTransformationMethod(l0(textView.getTransformationMethod()));
        }
    }

    @Override // A1.d
    public final void g0(boolean z2) {
        this.f975g = z2;
        TextView textView = this.f973e;
        textView.setTransformationMethod(l0(textView.getTransformationMethod()));
        textView.setFilters(I(textView.getFilters()));
    }

    @Override // A1.d
    public final TransformationMethod l0(TransformationMethod transformationMethod) {
        return this.f975g ? ((transformationMethod instanceof j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f982a : transformationMethod;
    }
}
