package okhttp3.internal.connection;

/* loaded from: classes3.dex */
public interface ExchangeFinder {
    RealConnection find();

    RealRoutePlanner getRoutePlanner();
}
