package androidx.os.serialization;

import android.os.Bundle;
import com.safedk.android.utils.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;

/* compiled from: SavedStateDecoder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"T", "Lkotlinx/serialization/DeserializationStrategy;", "deserializer", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", j.c, "decodeFromSavedStateNullable", "(Lkotlinx/serialization/DeserializationStrategy;Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)Ljava/lang/Object;", "decodeFromSavedState", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SavedStateDecoderKt {
    public static final Object decodeFromSavedStateNullable(DeserializationStrategy deserializer, Bundle savedState, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new SavedStateDecoder(savedState, configuration).decodeSerializableValue(deserializer);
    }
}
