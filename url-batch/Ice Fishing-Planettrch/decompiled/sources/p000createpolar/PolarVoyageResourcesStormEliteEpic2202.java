package p000createpolar;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageResourcesStormEliteEpic2202 {
    public final long PolarVoyageZipVortexCelestial6185;

    public PolarVoyageResourcesStormEliteEpic2202(long j) {
        this.PolarVoyageZipVortexCelestial6185 = j;
    }

    public static PolarVoyageResourcesStormEliteEpic2202 PolarVoyageZipVortexCelestial6185(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader.peek() == JsonToken.STRING ? new PolarVoyageResourcesStormEliteEpic2202(Long.parseLong(jsonReader.nextString())) : new PolarVoyageResourcesStormEliteEpic2202(jsonReader.nextLong());
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
        return (obj instanceof PolarVoyageResourcesStormEliteEpic2202) && this.PolarVoyageZipVortexCelestial6185 == ((PolarVoyageResourcesStormEliteEpic2202) obj).PolarVoyageZipVortexCelestial6185;
    }

    public final int hashCode() {
        long j = this.PolarVoyageZipVortexCelestial6185;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.PolarVoyageZipVortexCelestial6185 + "}";
    }
}
