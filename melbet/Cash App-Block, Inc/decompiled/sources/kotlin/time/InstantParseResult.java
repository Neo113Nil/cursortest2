package kotlin.time;

import kotlin.time.Instant;

/* loaded from: classes8.dex */
public interface InstantParseResult {

    /* loaded from: classes9.dex */
    public final class Failure implements InstantParseResult {
        public final String error;
        public final CharSequence input;

        public Failure(CharSequence charSequence, String str) {
            charSequence.getClass();
            this.error = str;
            this.input = charSequence;
        }

        @Override // kotlin.time.InstantParseResult
        public final Instant toInstant() {
            throw new InstantFormatException(this.error + " when parsing an Instant from \"" + InstantKt.truncateForErrorMessage(64, this.input) + '\"');
        }
    }

    /* loaded from: classes9.dex */
    public final class Success implements InstantParseResult {
        public final long epochSeconds;
        public final int nanosecondsOfSecond;

        public Success(long j, int i) {
            this.epochSeconds = j;
            this.nanosecondsOfSecond = i;
        }

        @Override // kotlin.time.InstantParseResult
        public final Instant toInstant() {
            Instant.Companion companion = Instant.Companion;
            long j = Instant.MIN.epochSeconds;
            long j2 = this.epochSeconds;
            if (j2 >= j && j2 <= Instant.MAX.epochSeconds) {
                return Instant.Companion.fromEpochSeconds(this.nanosecondsOfSecond, j2);
            }
            throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
        }
    }

    Instant toInstant();
}
