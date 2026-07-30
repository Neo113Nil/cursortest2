package androidx.graphics.shapes;

import androidx.collection.MutableFloatList;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import y5.h;

/* loaded from: classes.dex */
public final class DoubleMapper {
    public static final Companion Companion = new Companion(null);
    public static final DoubleMapper Identity;
    private final MutableFloatList sourceValues;
    private final MutableFloatList targetValues;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    static {
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.5f);
        Identity = new DoubleMapper(h.to(valueOf, valueOf), h.to(valueOf2, valueOf2));
    }

    public DoubleMapper(Pair<Float, Float>... mappings) {
        s.checkNotNullParameter(mappings, "mappings");
        this.sourceValues = new MutableFloatList(mappings.length);
        this.targetValues = new MutableFloatList(mappings.length);
        int length = mappings.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.sourceValues.add(mappings[i8].getFirst().floatValue());
            this.targetValues.add(mappings[i8].getSecond().floatValue());
        }
        FloatMappingKt.validateProgress(this.sourceValues);
        FloatMappingKt.validateProgress(this.targetValues);
    }

    public final float map(float f8) {
        return FloatMappingKt.linearMap(this.sourceValues, this.targetValues, f8);
    }

    public final float mapBack(float f8) {
        return FloatMappingKt.linearMap(this.targetValues, this.sourceValues, f8);
    }
}
