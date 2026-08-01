package x0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends r1.b {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3848a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3849b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3850c = true;

    public f(TextView textView) {
        this.f3848a = textView;
        this.f3849b = new d(textView);
    }

    public final void F() {
        TextView textView = this.f3848a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f3850c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f3855f;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // r1.b
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        if (!this.f3850c) {
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
            d dVar = this.f3849b;
            if (i6 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i6] == dVar) {
                return inputFilterArr;
            }
            i6++;
        }
    }

    @Override // r1.b
    public final void y(boolean z4) {
        if (z4) {
            F();
        }
    }

    @Override // r1.b
    public final void z(boolean z4) {
        this.f3850c = z4;
        F();
        TextView textView = this.f3848a;
        textView.setFilters(l(textView.getFilters()));
    }
}
