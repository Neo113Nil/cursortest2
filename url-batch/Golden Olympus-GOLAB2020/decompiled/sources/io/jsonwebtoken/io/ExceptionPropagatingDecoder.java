package io.jsonwebtoken.io;

import io.jsonwebtoken.lang.Assert;

/* loaded from: classes3.dex */
class ExceptionPropagatingDecoder<T, R> implements Decoder<T, R> {
    private final Decoder<T, R> decoder;

    ExceptionPropagatingDecoder(Decoder<T, R> decoder) {
        Assert.notNull(decoder, "Decoder cannot be null.");
        this.decoder = decoder;
    }

    @Override // io.jsonwebtoken.io.Decoder
    public R decode(T t4) {
        Assert.notNull(t4, "Decode argument cannot be null.");
        try {
            return this.decoder.decode(t4);
        } catch (DecodingException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new DecodingException("Unable to decode input: " + e5.getMessage(), e5);
        }
    }
}
