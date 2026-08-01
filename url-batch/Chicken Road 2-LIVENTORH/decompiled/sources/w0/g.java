package w0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends t0.d {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3568a;

    /* renamed from: b, reason: collision with root package name */
    public final e f3569b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3570c = true;

    public g(TextView textView) {
        this.f3568a = textView;
        this.f3569b = new e(textView);
    }

    @Override // t0.d
    public final InputFilter[] g(InputFilter[] inputFilterArr) {
        if (!this.f3570c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof e) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (sparseArray.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i6 = 0;
        while (true) {
            e eVar = this.f3569b;
            if (i6 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i6] == eVar) {
                return inputFilterArr;
            }
            i6++;
        }
    }

    @Override // t0.d
    public final void r(boolean z3) {
        if (z3) {
            v();
        }
    }

    @Override // t0.d
    public final void s(boolean z3) {
        this.f3570c = z3;
        v();
        TextView textView = this.f3568a;
        textView.setFilters(g(textView.getFilters()));
    }

    public final void v() {
        TextView textView = this.f3568a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f3570c) {
            if (!(transformationMethod instanceof k) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new k(transformationMethod);
            }
        } else if (transformationMethod instanceof k) {
            transformationMethod = ((k) transformationMethod).f3576f;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
