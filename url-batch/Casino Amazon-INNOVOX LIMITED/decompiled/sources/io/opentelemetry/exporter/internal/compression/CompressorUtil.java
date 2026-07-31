package io.opentelemetry.exporter.internal.compression;

import com.facebook.react.uimanager.ViewProps;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.opentelemetry.api.internal.Utils;
import io.opentelemetry.common.ComponentLoader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class CompressorUtil {
    private static final Map<String, Compressor> compressorRegistry = buildCompressorRegistry(ComponentLoader.forClassLoader(CompressorUtil.class.getClassLoader()));

    private CompressorUtil() {
    }

    @Nullable
    public static Compressor validateAndResolveCompressor(String str) {
        return validateAndResolveCompressor(str, null);
    }

    @Nullable
    public static Compressor validateAndResolveCompressor(String str, @Nullable ComponentLoader componentLoader) {
        Map<String, Compressor> buildCompressorRegistry = componentLoader == null ? compressorRegistry : buildCompressorRegistry(componentLoader);
        Set<String> keySet = buildCompressorRegistry.keySet();
        Compressor compressor = buildCompressorRegistry.get(str);
        Utils.checkArgument(ViewProps.NONE.equals(str) || compressor != null, "Unsupported compressionMethod. Compression method must be \"none\" or one of: " + ((String) keySet.stream().collect(Collectors.joining(StringUtils.COMMA, "[", "]"))));
        return compressor;
    }

    private static Map<String, Compressor> buildCompressorRegistry(ComponentLoader componentLoader) {
        HashMap hashMap = new HashMap();
        Iterator it = componentLoader.load(CompressorProvider.class).iterator();
        while (it.hasNext()) {
            Compressor compressorProvider = ((CompressorProvider) it.next()).getInstance();
            hashMap.put(compressorProvider.getEncoding(), compressorProvider);
        }
        hashMap.put(GzipCompressor.getInstance().getEncoding(), GzipCompressor.getInstance());
        return hashMap;
    }
}
