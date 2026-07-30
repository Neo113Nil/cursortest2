package kotlin.reflect;

import java.util.List;

/* loaded from: classes4.dex */
public interface r extends f {
    String getName();

    List<q> getUpperBounds();

    KVariance getVariance();

    boolean isReified();
}
