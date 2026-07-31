package coil.size;

/* compiled from: SizeResolver.kt */
/* loaded from: classes15.dex */
public abstract class SizeResolvers {
    public static final SizeResolver create(Size size) {
        return new RealSizeResolver(size);
    }
}
