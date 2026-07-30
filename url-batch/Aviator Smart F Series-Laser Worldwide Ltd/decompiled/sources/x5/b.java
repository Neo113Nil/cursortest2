package x5;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class b {
    private final float density;

    public b(float f8) {
        this.density = f8;
    }

    @NonNull
    public static b create(@NonNull Context context) {
        return new b(context.getResources().getDisplayMetrics().density);
    }

    public int toPx(int i8) {
        return (int) ((i8 * this.density) + 0.5f);
    }

    @NonNull
    public static b create(float f8) {
        return new b(f8);
    }
}
