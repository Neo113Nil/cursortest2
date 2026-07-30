package p000createpolar;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageGuidelineSparkLegendTurbo3156 extends Handler {
    public static final PolarVoyageGuidelineSparkLegendTurbo3156 PolarVoyageZipVortexCelestial6185 = new PolarVoyageGuidelineSparkLegendTurbo3156();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = PolarVoyageResourcesTitanAuroraPixel4448.PolarVoyageZipVortexCelestial6185;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        PolarVoyageResourcesTitanAuroraPixel4448.PolarVoyageZipVortexCelestial6185(loggerName, i, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
