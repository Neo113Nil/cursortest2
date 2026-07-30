package W;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends P0.f {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2776a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2777b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2778c = true;

    public f(TextView textView) {
        this.f2776a = textView;
        this.f2777b = new d(textView);
    }

    @Override // P0.f
    public final void G(boolean z7) {
        if (z7) {
            TextView textView = this.f2776a;
            textView.setTransformationMethod(Q(textView.getTransformationMethod()));
        }
    }

    @Override // P0.f
    public final void J(boolean z7) {
        this.f2778c = z7;
        TextView textView = this.f2776a;
        textView.setTransformationMethod(Q(textView.getTransformationMethod()));
        textView.setFilters(s(textView.getFilters()));
    }

    @Override // P0.f
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return this.f2778c ? transformationMethod instanceof j ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new j(transformationMethod) : transformationMethod instanceof j ? ((j) transformationMethod).f2785d : transformationMethod;
    }

    @Override // P0.f
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        if (!this.f2778c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i5 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (sparseArray.indexOfKey(i7) < 0) {
                    inputFilterArr2[i5] = inputFilterArr[i7];
                    i5++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i8 = 0;
        while (true) {
            d dVar = this.f2777b;
            if (i8 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i8] == dVar) {
                return inputFilterArr;
            }
            i8++;
        }
    }

    @Override // P0.f
    public final boolean x() {
        return this.f2778c;
    }
}
