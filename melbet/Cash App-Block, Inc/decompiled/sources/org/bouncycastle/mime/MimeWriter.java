package org.bouncycastle.mime;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class MimeWriter {
    protected final Headers headers;

    public MimeWriter(Headers headers) {
        this.headers = headers;
    }

    public static List<String> mapToLines(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (String str : map.keySet()) {
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": ");
            m108m.append(map.get(str));
            arrayList.add(m108m.toString());
        }
        return arrayList;
    }

    public abstract OutputStream getContentStream();

    public Headers getHeaders() {
        return this.headers;
    }
}
