package androidx.os.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateWriter;
import com.safedk.android.utils.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;

/* compiled from: SavedStateEncoder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\n\u001a\u00060\u0006j\u0002`\u0007\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"T", "Lkotlinx/serialization/SerializationStrategy;", "serializer", "value", "Landroidx/savedstate/serialization/SavedStateConfiguration;", j.c, "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "encodeToSavedStateNullable", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;Landroidx/savedstate/serialization/SavedStateConfiguration;)Landroid/os/Bundle;", "encodeToSavedState", "savedstate"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SavedStateEncoderKt {
    public static final Bundle encodeToSavedStateNullable(SerializationStrategy serializer, Object obj, SavedStateConfiguration configuration) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Map emptyMap = MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(emptyMap.size());
            for (Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m2843constructorimpl(bundleOf);
        new SavedStateEncoder(bundleOf, configuration).encodeSerializableValue(serializer, obj);
        return bundleOf;
    }
}
