package androidx.graphics.shapes;

import androidx.collection.FloatFloatPair;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class Feature {
    private final List<Cubic> cubics;

    public static final class Corner extends Feature {
        private final boolean convex;
        private final long roundedCenter;
        private final long vertex;

        public /* synthetic */ Corner(List list, long j8, long j9, boolean z7, o oVar) {
            this(list, j8, j9, z7);
        }

        public final boolean getConvex() {
            return this.convex;
        }

        /* renamed from: getRoundedCenter-1ufDz9w, reason: not valid java name */
        public final long m43getRoundedCenter1ufDz9w() {
            return this.roundedCenter;
        }

        /* renamed from: getVertex-1ufDz9w, reason: not valid java name */
        public final long m44getVertex1ufDz9w() {
            return this.vertex;
        }

        public String toString() {
            return "Corner: vertex=" + ((Object) FloatFloatPair.m15toStringimpl(this.vertex)) + ", center=" + ((Object) FloatFloatPair.m15toStringimpl(this.roundedCenter)) + ", convex=" + this.convex;
        }

        @Override // androidx.graphics.shapes.Feature
        public Feature transformed$graphics_shapes_release(PointTransformer f8) {
            s.checkNotNullParameter(f8, "f");
            List createListBuilder = q.createListBuilder();
            int size = getCubics().size();
            for (int i8 = 0; i8 < size; i8++) {
                createListBuilder.add(getCubics().get(i8).transformed(f8));
            }
            return new Corner(q.build(createListBuilder), PointKt.m61transformedso9K2fw(this.vertex, f8), PointKt.m61transformedso9K2fw(this.roundedCenter, f8), this.convex, null);
        }

        public /* synthetic */ Corner(List list, long j8, long j9, boolean z7, int i8, o oVar) {
            this(list, j8, j9, (i8 & 8) != 0 ? true : z7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Corner(List<? extends Cubic> cubics, long j8, long j9, boolean z7) {
            super(cubics);
            s.checkNotNullParameter(cubics, "cubics");
            this.vertex = j8;
            this.roundedCenter = j9;
            this.convex = z7;
        }
    }

    public static final class Edge extends Feature {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Edge(List<? extends Cubic> cubics) {
            super(cubics);
            s.checkNotNullParameter(cubics, "cubics");
        }

        public String toString() {
            return "Edge";
        }

        @Override // androidx.graphics.shapes.Feature
        public Edge transformed$graphics_shapes_release(PointTransformer f8) {
            s.checkNotNullParameter(f8, "f");
            List createListBuilder = q.createListBuilder();
            int size = getCubics().size();
            for (int i8 = 0; i8 < size; i8++) {
                createListBuilder.add(getCubics().get(i8).transformed(f8));
            }
            return new Edge(q.build(createListBuilder));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Feature(List<? extends Cubic> cubics) {
        s.checkNotNullParameter(cubics, "cubics");
        this.cubics = cubics;
    }

    public final List<Cubic> getCubics() {
        return this.cubics;
    }

    public abstract Feature transformed$graphics_shapes_release(PointTransformer pointTransformer);
}
