package org.apache.commons.imaging.common;

import java.util.Map;
import org.apache.commons.imaging.common.bytesource.ByteSource;

/* loaded from: classes9.dex */
public interface XmpEmbeddable {
    String getXmpXml(ByteSource byteSource, Map<String, Object> map);
}
