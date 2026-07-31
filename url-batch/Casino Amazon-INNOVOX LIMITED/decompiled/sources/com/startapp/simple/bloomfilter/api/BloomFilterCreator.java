package com.startapp.simple.bloomfilter.api;

import com.startapp.simple.bloomfilter.algo.AlwaysNotContainsBloomContainer;
import com.startapp.simple.bloomfilter.algo.BloomContainer;
import com.startapp.simple.bloomfilter.algo.BloomContainerWithValidBitSet;
import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.codec.StringUtils;
import com.startapp.simple.bloomfilter.creation.DeserializerTokenToBitSet;
import com.startapp.simple.bloomfilter.creation.Serializer;
import com.startapp.simple.bloomfilter.data.TokenData;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.startapp.simple.bloomfilter.parsing.TokenParser;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import com.startapp.simple.bloomfilter.version.VersionFactoryHolder;
import java.util.List;

/* loaded from: classes3.dex */
public class BloomFilterCreator {
    private static final String ALL_EXISTS_TOKEN = "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF";
    private static final OpenBitSet BIT_SET_ALL_EXIST = new DeserializerTokenToBitSet(BloomVersion.FOUR.getNumberOfHashes(), BloomVersion.FOUR.getSizeOfBucket()).convert(ALL_EXISTS_TOKEN);
    private final TokenBuilder tokenBuilder;
    private final TokenParser tokenParser;
    private final VersionFactoryHolder versionFactoryHolder;

    public BloomFilterCreator() {
        Serializer serializer = new Serializer();
        VersionFactoryHolder versionFactoryHolder = new VersionFactoryHolder();
        this.versionFactoryHolder = versionFactoryHolder;
        this.tokenBuilder = new TokenBuilder(serializer, versionFactoryHolder);
        this.tokenParser = new TokenParser();
    }

    private BloomFilterCreator(TokenBuilder tokenBuilder, TokenParser tokenParser, VersionFactoryHolder versionFactoryHolder) {
        this.tokenBuilder = tokenBuilder;
        this.tokenParser = tokenParser;
        this.versionFactoryHolder = versionFactoryHolder;
    }

    public BloomContainer fromToken(String str) {
        if (StringUtils.isBlank(str)) {
            return new AlwaysNotContainsBloomContainer(null);
        }
        TokenData fromTokenString = this.tokenParser.fromTokenString(str);
        if (fromTokenString == null) {
            return new AlwaysNotContainsBloomContainer(null);
        }
        BloomVersion bloomVersion = fromTokenString.getBloomVersion();
        OpenBitSet convert = this.versionFactoryHolder.getTokenToBitSet(bloomVersion).convert(this.versionFactoryHolder.getTokenCompression(bloomVersion).decompress(fromTokenString.bloom()));
        if (convert == null) {
            return new AlwaysNotContainsBloomContainer(bloomVersion);
        }
        return new BloomContainerWithValidBitSet(this.versionFactoryHolder.getBitSetHandling(bloomVersion), convert, bloomVersion);
    }

    public String tokenFromContainer(BloomContainer bloomContainer) {
        return new TokenBuilder(new Serializer(), this.versionFactoryHolder).asToken(bloomContainer.getBloomVersion(), bloomContainer.getBitSet(), System.currentTimeMillis());
    }

    public BloomContainer tokenWithAllExisting() {
        return new BloomContainerWithValidBitSet(this.versionFactoryHolder.getBitSetHandling(BloomVersion.FOUR), BIT_SET_ALL_EXIST, BloomVersion.FOUR);
    }

    public String fromKeys(BloomVersion bloomVersion, List<String> list) {
        return createToken(bloomVersion, list, System.currentTimeMillis());
    }

    public String fromKeys(List<String> list) {
        return createToken(BloomVersion.FOUR, list, System.currentTimeMillis());
    }

    String createToken(BloomVersion bloomVersion, List<String> list, long j) {
        return this.tokenBuilder.asToken(bloomVersion, this.versionFactoryHolder.getBitSetHandling(bloomVersion).keysToBitSet(list), j);
    }

    public long[] hashBytesOfKey(String str) {
        return hashBytesOfKey(BloomVersion.FOUR, str);
    }

    public long[] hashBytesOfKey(BloomVersion bloomVersion, String str) {
        return this.versionFactoryHolder.getBitSetHandling(bloomVersion).hashBucketsFromApplication(str);
    }

    static BloomFilterCreator createForTesting(TokenBuilder tokenBuilder, TokenParser tokenParser, VersionFactoryHolder versionFactoryHolder) {
        return new BloomFilterCreator(tokenBuilder, tokenParser, versionFactoryHolder);
    }
}
