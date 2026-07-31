package d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends AbstractC2398a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36152a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // d.AbstractC2398a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // d.AbstractC2398a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ActivityResult c(int i4, Intent intent) {
        return new ActivityResult(i4, intent);
    }
}
