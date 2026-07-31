package Q;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public interface j {
    Object getDefaultValue();

    Object readFrom(InputStream inputStream, kotlin.coroutines.d dVar);

    Object writeTo(Object obj, OutputStream outputStream, kotlin.coroutines.d dVar);
}
