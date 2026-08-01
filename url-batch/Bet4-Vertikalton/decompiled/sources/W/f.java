package W;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f902a;

    /* renamed from: b, reason: collision with root package name */
    public final d f903b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f904c = true;

    public f(TextView textView) {
        this.f902a = textView;
        this.f903b = new d(textView);
    }

    @Override // w1.d
    public final InputFilter[] D(InputFilter[] inputFilterArr) {
        if (!this.f904c) {
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
            d dVar = this.f903b;
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

    @Override // w1.d
    public final void k0(boolean z2) {
        if (z2) {
            x0();
        }
    }

    @Override // w1.d
    public final void l0(boolean z2) {
        this.f904c = z2;
        x0();
        TextView textView = this.f902a;
        textView.setFilters(D(textView.getFilters()));
    }

    public final void x0() {
        TextView textView = this.f902a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f904c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f910a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
