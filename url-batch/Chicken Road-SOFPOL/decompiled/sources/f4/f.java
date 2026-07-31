package f4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends s6.a {

    /* renamed from: g, reason: collision with root package name */
    public final TextView f2728g;

    /* renamed from: h, reason: collision with root package name */
    public final d f2729h;
    public boolean i = true;

    public f(TextView textView) {
        this.f2728g = textView;
        this.f2729h = new d(textView);
    }

    @Override // s6.a
    public final void E(boolean z3) {
        if (z3) {
            M();
        }
    }

    @Override // s6.a
    public final void F(boolean z3) {
        this.i = z3;
        M();
        TextView textView = this.f2728g;
        textView.setFilters(s(textView.getFilters()));
    }

    public final void M() {
        TextView textView = this.f2728g;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.i) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f2735d;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // s6.a
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        if (!this.i) {
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
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (sparseArray.indexOfKey(i9) < 0) {
                    inputFilterArr2[i8] = inputFilterArr[i9];
                    i8++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            d dVar = this.f2729h;
            if (i10 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i10] == dVar) {
                return inputFilterArr;
            }
            i10++;
        }
    }
}
