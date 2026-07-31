package io.jsonwebtoken.io;

import io.jsonwebtoken.lang.Assert;

/* loaded from: classes3.dex */
class ExceptionPropagatingEncoder<T, R> implements Encoder<T, R> {
    private final Encoder<T, R> encoder;

    ExceptionPropagatingEncoder(Encoder<T, R> encoder) {
        Assert.notNull(encoder, "Encoder cannot be null.");
        this.encoder = encoder;
    }

    @Override // io.jsonwebtoken.io.Encoder
    public R encode(T t4) {
        Assert.notNull(t4, "Encode argument cannot be null.");
        try {
            return this.encoder.encode(t4);
        } catch (EncodingException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new EncodingException("Unable to encode input: " + e5.getMessage(), e5);
        }
    }
}
