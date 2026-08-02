package K1;

import E.AbstractC0005f;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f1516a;

    public m(long j4) {
        this.f1516a = j4;
    }

    public static m a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new m(Long.parseLong(jsonReader.nextString())) : new m(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof m) && this.f1516a == ((m) obj).f1516a;
    }

    public final int hashCode() {
        long j4 = this.f1516a;
        return ((int) ((j4 >>> 32) ^ j4)) ^ 1000003;
    }

    public final String toString() {
        return AbstractC0005f.p(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f1516a, "}");
    }
}
