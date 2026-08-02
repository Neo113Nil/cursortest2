package org.apache.commons.imaging.formats.rgbe;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.color.ColorSpace;
import java.awt.image.BandedSampleModel;
import java.awt.image.BufferedImage;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferFloat;
import java.awt.image.Raster;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import org.apache.commons.imaging.ImageFormat;
import org.apache.commons.imaging.ImageFormats;
import org.apache.commons.imaging.ImageInfo;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes9.dex */
public class RgbeImageParser extends ImageParser {
    public RgbeImageParser() {
        setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String[] getAcceptedExtensions() {
        return new String[]{".hdr", ".pic"};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageFormat[] getAcceptedTypes() {
        return new ImageFormat[]{ImageFormats.RGBE};
    }

    @Override // org.apache.commons.imaging.ImageParser
    public BufferedImage getBufferedImage(ByteSource byteSource, Map<String, Object> map) {
        RgbeInfo rgbeInfo = new RgbeInfo(byteSource);
        try {
            DataBufferFloat dataBufferFloat = new DataBufferFloat(rgbeInfo.getPixelData(), rgbeInfo.getWidth() * rgbeInfo.getHeight());
            BufferedImage bufferedImage = new BufferedImage(new ComponentColorModel(ColorSpace.getInstance(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO), false, false, 1, dataBufferFloat.getDataType()), Raster.createWritableRaster(new BandedSampleModel(dataBufferFloat.getDataType(), rgbeInfo.getWidth(), rgbeInfo.getHeight(), 3), dataBufferFloat, new Point()), false, (Hashtable) null);
            rgbeInfo.close();
            return bufferedImage;
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getDefaultExtension() {
        return ".hdr";
    }

    @Override // org.apache.commons.imaging.ImageParser
    public byte[] getICCProfileBytes(ByteSource byteSource, Map<String, Object> map) {
        return null;
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageInfo getImageInfo(ByteSource byteSource, Map<String, Object> map) {
        RgbeInfo rgbeInfo = new RgbeInfo(byteSource);
        try {
            ImageInfo imageInfo = new ImageInfo(getName(), 32, new ArrayList(), ImageFormats.RGBE, getName(), rgbeInfo.getHeight(), "image/vnd.radiance", 1, -1, -1.0f, -1, -1.0f, rgbeInfo.getWidth(), false, false, false, ImageInfo.ColorType.RGB, ImageInfo.CompressionAlgorithm.ADAPTIVE_RLE);
            rgbeInfo.close();
            return imageInfo;
        } finally {
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public Dimension getImageSize(ByteSource byteSource, Map<String, Object> map) {
        RgbeInfo rgbeInfo = new RgbeInfo(byteSource);
        try {
            Dimension dimension = new Dimension(rgbeInfo.getWidth(), rgbeInfo.getHeight());
            rgbeInfo.close();
            return dimension;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    rgbeInfo.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public ImageMetadata getMetadata(ByteSource byteSource, Map<String, Object> map) {
        RgbeInfo rgbeInfo = new RgbeInfo(byteSource);
        try {
            ImageMetadata metadata = rgbeInfo.getMetadata();
            rgbeInfo.close();
            return metadata;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    rgbeInfo.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // org.apache.commons.imaging.ImageParser
    public String getName() {
        return "Radiance HDR";
    }
}
