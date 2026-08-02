package com.squareup.moshi;

import bo.app.a$$ExternalSyntheticBUOutline0;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Source;
import okio.Timeout;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public final class JsonValueSource implements Source {
    public static final ByteString STATE_C_STYLE_COMMENT;
    public static final ByteString STATE_DOUBLE_QUOTED;
    public static final ByteString STATE_END_OF_JSON;
    public static final ByteString STATE_END_OF_LINE_COMMENT;
    public static final ByteString STATE_JSON;
    public static final ByteString STATE_SINGLE_QUOTED;
    public final Buffer buffer;
    public final Buffer prefix;
    public final BufferedSource source;
    public int stackSize;
    public ByteString state;
    public long limit = 0;
    public boolean closed = false;

    static {
        ByteString.Companion companion = ByteString.Companion;
        STATE_JSON = ByteString.Companion.encodeUtf8("[]{}\"'/#");
        STATE_SINGLE_QUOTED = ByteString.Companion.encodeUtf8("'\\");
        STATE_DOUBLE_QUOTED = ByteString.Companion.encodeUtf8("\"\\");
        STATE_END_OF_LINE_COMMENT = ByteString.Companion.encodeUtf8("\r\n");
        STATE_C_STYLE_COMMENT = ByteString.Companion.encodeUtf8(Marker.ANY_MARKER);
        STATE_END_OF_JSON = ByteString.EMPTY;
    }

    public JsonValueSource(BufferedSource bufferedSource, Buffer buffer, ByteString byteString, int i) {
        this.source = bufferedSource;
        this.buffer = bufferedSource.getBuffer();
        this.prefix = buffer;
        this.state = byteString;
        this.stackSize = i;
    }

    public final void advanceLimit(long j) {
        while (true) {
            long j2 = this.limit;
            if (j2 >= j) {
                return;
            }
            ByteString byteString = this.state;
            ByteString byteString2 = STATE_END_OF_JSON;
            if (byteString == byteString2) {
                return;
            }
            Buffer buffer = this.buffer;
            long j3 = buffer.size;
            BufferedSource bufferedSource = this.source;
            if (j2 == j3) {
                if (j2 > 0) {
                    return;
                } else {
                    bufferedSource.require(1L);
                }
            }
            long indexOfElement = buffer.indexOfElement(this.limit, this.state);
            if (indexOfElement == -1) {
                this.limit = buffer.size;
            } else {
                byte b = buffer.getByte(indexOfElement);
                ByteString byteString3 = this.state;
                ByteString byteString4 = STATE_DOUBLE_QUOTED;
                ByteString byteString5 = STATE_SINGLE_QUOTED;
                ByteString byteString6 = STATE_C_STYLE_COMMENT;
                ByteString byteString7 = STATE_END_OF_LINE_COMMENT;
                ByteString byteString8 = STATE_JSON;
                if (byteString3 == byteString8) {
                    if (b == 34) {
                        this.state = byteString4;
                        this.limit = indexOfElement + 1;
                    } else if (b == 35) {
                        this.state = byteString7;
                        this.limit = indexOfElement + 1;
                    } else if (b == 39) {
                        this.state = byteString5;
                        this.limit = indexOfElement + 1;
                    } else if (b != 47) {
                        if (b != 91) {
                            if (b != 93) {
                                if (b != 123) {
                                    if (b != 125) {
                                    }
                                }
                            }
                            int i = this.stackSize - 1;
                            this.stackSize = i;
                            if (i == 0) {
                                this.state = byteString2;
                            }
                            this.limit = indexOfElement + 1;
                        }
                        this.stackSize++;
                        this.limit = indexOfElement + 1;
                    } else {
                        long j4 = 2 + indexOfElement;
                        bufferedSource.require(j4);
                        long j5 = indexOfElement + 1;
                        byte b2 = buffer.getByte(j5);
                        if (b2 == 47) {
                            this.state = byteString7;
                            this.limit = j4;
                        } else if (b2 == 42) {
                            this.state = byteString6;
                            this.limit = j4;
                        } else {
                            this.limit = j5;
                        }
                    }
                } else if (byteString3 == byteString5 || byteString3 == byteString4) {
                    if (b == 92) {
                        long j6 = indexOfElement + 2;
                        bufferedSource.require(j6);
                        this.limit = j6;
                    } else {
                        if (this.stackSize > 0) {
                            byteString2 = byteString8;
                        }
                        this.state = byteString2;
                        this.limit = indexOfElement + 1;
                    }
                } else if (byteString3 == byteString6) {
                    long j7 = 2 + indexOfElement;
                    bufferedSource.require(j7);
                    long j8 = indexOfElement + 1;
                    if (buffer.getByte(j8) == 47) {
                        this.limit = j7;
                        this.state = byteString8;
                    } else {
                        this.limit = j8;
                    }
                } else if (byteString3 != byteString7) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                } else {
                    this.limit = indexOfElement + 1;
                    this.state = byteString8;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.closed = true;
    }

    public final void discard() {
        this.closed = true;
        while (this.state != STATE_END_OF_JSON) {
            advanceLimit(8192L);
            this.source.skip(this.limit);
        }
    }

    @Override // okio.Source
    public final long read(Buffer buffer, long j) {
        if (this.closed) {
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        Buffer buffer2 = this.prefix;
        boolean exhausted = buffer2.exhausted();
        Buffer buffer3 = this.buffer;
        if (!exhausted) {
            long read = buffer2.read(buffer, j);
            long j2 = j - read;
            if (!buffer3.exhausted()) {
                long read2 = read(buffer, j2);
                if (read2 != -1) {
                    return read2 + read;
                }
            }
            return read;
        }
        advanceLimit(j);
        long j3 = this.limit;
        if (j3 == 0) {
            if (this.state == STATE_END_OF_JSON) {
                return -1L;
            }
            Path$$ExternalSyntheticBUOutline0.m$2();
            return 0L;
        }
        long min = Math.min(j, j3);
        buffer.write(buffer3, min);
        this.limit -= min;
        return min;
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.source.timeout();
    }
}
