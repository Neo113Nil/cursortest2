package org.apache.commons.imaging.formats.jpeg;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.Imaging;
import org.apache.commons.imaging.ImagingException;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.formats.tiff.JpegImageData;
import org.apache.commons.imaging.formats.tiff.TiffField;
import org.apache.commons.imaging.formats.tiff.TiffImageData;
import org.apache.commons.imaging.formats.tiff.TiffImageMetadata;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.internal.Debug;

/* loaded from: classes9.dex */
public class JpegImageMetadata implements ImageMetadata {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final TiffImageMetadata exif;
    private final JpegPhotoshopMetadata photoshop;

    public JpegImageMetadata(JpegPhotoshopMetadata jpegPhotoshopMetadata, TiffImageMetadata tiffImageMetadata) {
        this.photoshop = jpegPhotoshopMetadata;
        this.exif = tiffImageMetadata;
    }

    public void dump() {
        Debug.debug(toString());
    }

    public TiffField findEXIFValue(TagInfo tagInfo) {
        try {
            TiffImageMetadata tiffImageMetadata = this.exif;
            if (tiffImageMetadata != null) {
                return tiffImageMetadata.findField(tagInfo);
            }
        } catch (ImageReadException unused) {
        }
        return null;
    }

    public TiffField findEXIFValueWithExactMatch(TagInfo tagInfo) {
        try {
            TiffImageMetadata tiffImageMetadata = this.exif;
            if (tiffImageMetadata != null) {
                return tiffImageMetadata.findField(tagInfo, true);
            }
        } catch (ImageReadException unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BufferedImage getEXIFThumbnail() {
        ByteArrayInputStream byteArrayInputStream;
        BufferedImage read;
        TiffImageMetadata tiffImageMetadata = this.exif;
        if (tiffImageMetadata == null) {
            return null;
        }
        Iterator<? extends ImageMetadata.ImageMetadataItem> it = tiffImageMetadata.getDirectories().iterator();
        while (it.hasNext()) {
            TiffImageMetadata.Directory directory = (TiffImageMetadata.Directory) it.next();
            BufferedImage thumbnail = directory.getThumbnail();
            if (thumbnail != null) {
                return thumbnail;
            }
            JpegImageData jpegImageData = directory.getJpegImageData();
            if (jpegImageData != null) {
                try {
                    read = Imaging.getBufferedImage(jpegImageData.getData());
                } catch (IOException unused) {
                    byteArrayInputStream = new ByteArrayInputStream(jpegImageData.getData());
                    read = ImageIO.read(byteArrayInputStream);
                    if (read != null) {
                    }
                } catch (ImagingException unused2) {
                    byteArrayInputStream = new ByteArrayInputStream(jpegImageData.getData());
                    read = ImageIO.read(byteArrayInputStream);
                    if (read != null) {
                    }
                } catch (Throwable th) {
                    ImageIO.read(new ByteArrayInputStream(jpegImageData.getData()));
                    throw th;
                }
                if (read != null) {
                    return read;
                }
            }
        }
        return null;
    }

    public byte[] getEXIFThumbnailData() {
        TiffImageMetadata tiffImageMetadata = this.exif;
        if (tiffImageMetadata == null) {
            return null;
        }
        Iterator<? extends ImageMetadata.ImageMetadataItem> it = tiffImageMetadata.getDirectories().iterator();
        while (it.hasNext()) {
            TiffImageMetadata.Directory directory = (TiffImageMetadata.Directory) it.next();
            byte[] data = directory.getJpegImageData() != null ? directory.getJpegImageData().getData() : null;
            if (data != null) {
                return data;
            }
        }
        return null;
    }

    public Dimension getEXIFThumbnailSize() {
        byte[] eXIFThumbnailData = getEXIFThumbnailData();
        if (eXIFThumbnailData != null) {
            return Imaging.getImageSize(eXIFThumbnailData);
        }
        return null;
    }

    public TiffImageMetadata getExif() {
        return this.exif;
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public List<ImageMetadata.ImageMetadataItem> getItems() {
        ArrayList arrayList = new ArrayList();
        TiffImageMetadata tiffImageMetadata = this.exif;
        if (tiffImageMetadata != null) {
            arrayList.addAll(tiffImageMetadata.getItems());
        }
        JpegPhotoshopMetadata jpegPhotoshopMetadata = this.photoshop;
        if (jpegPhotoshopMetadata != null) {
            arrayList.addAll(jpegPhotoshopMetadata.getItems());
        }
        return arrayList;
    }

    public JpegPhotoshopMetadata getPhotoshop() {
        return this.photoshop;
    }

    public TiffImageData getRawImageData() {
        TiffImageMetadata tiffImageMetadata = this.exif;
        if (tiffImageMetadata == null) {
            return null;
        }
        Iterator<? extends ImageMetadata.ImageMetadataItem> it = tiffImageMetadata.getDirectories().iterator();
        while (it.hasNext()) {
            TiffImageData tiffImageData = ((TiffImageMetadata.Directory) it.next()).getTiffImageData();
            if (tiffImageData != null) {
                return tiffImageData;
            }
        }
        return null;
    }

    @Override // org.apache.commons.imaging.common.ImageMetadata
    public String toString(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(str);
        if (this.exif == null) {
            m.append("No Exif metadata.");
        } else {
            m.append("Exif metadata:");
            m.append(NEWLINE);
            m.append(this.exif.toString("\t"));
        }
        String str2 = NEWLINE;
        m.append(str2);
        m.append(str);
        if (this.photoshop == null) {
            m.append("No Photoshop (IPTC) metadata.");
        } else {
            m.append("Photoshop (IPTC) metadata:");
            m.append(str2);
            m.append(this.photoshop.toString("\t"));
        }
        return m.toString();
    }

    public String toString() {
        return toString(null);
    }
}
