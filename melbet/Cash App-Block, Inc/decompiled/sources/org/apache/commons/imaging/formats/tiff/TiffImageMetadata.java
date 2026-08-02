package org.apache.commons.imaging.formats.tiff;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.image.BufferedImage;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;
import org.apache.commons.imaging.common.GenericImageMetadata;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.RationalNumber;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffDirectoryType;
import org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfo;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts;
import org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputField;
import org.apache.commons.imaging.formats.tiff.write.TiffOutputSet;

/* loaded from: classes9.dex */
public class TiffImageMetadata extends GenericImageMetadata {
    public final TiffContents contents;

    public static class Directory extends GenericImageMetadata implements ImageMetadata.ImageMetadataItem {
        private final ByteOrder byteOrder;
        private final TiffDirectory directory;

        /* renamed from: type, reason: collision with root package name */
        public final int f1556type;

        public Directory(ByteOrder byteOrder, TiffDirectory tiffDirectory) {
            this.f1556type = tiffDirectory.f1555type;
            this.directory = tiffDirectory;
            this.byteOrder = byteOrder;
        }

        public void add(TiffField tiffField) {
            add(new TiffMetadataItem(tiffField));
        }

        public TiffField findField(TagInfo tagInfo) {
            return this.directory.findField(tagInfo);
        }

        public List<TiffField> getAllFields() {
            return this.directory.getDirectoryEntries();
        }

        public JpegImageData getJpegImageData() {
            return this.directory.getJpegImageData();
        }

        public TiffOutputDirectory getOutputDirectory(ByteOrder byteOrder) {
            try {
                TiffOutputDirectory tiffOutputDirectory = new TiffOutputDirectory(this.f1556type, byteOrder);
                Iterator<? extends ImageMetadata.ImageMetadataItem> it = getItems().iterator();
                while (it.hasNext()) {
                    TiffField tiffField = ((TiffMetadataItem) it.next()).getTiffField();
                    if (tiffOutputDirectory.findField(tiffField.getTag()) == null && !tiffField.getTagInfo().isOffset()) {
                        TagInfo tagInfo = tiffField.getTagInfo();
                        FieldType fieldType = tiffField.getFieldType();
                        byte[] encodeValue = tagInfo.encodeValue(fieldType, tiffField.getValue(), byteOrder);
                        TiffOutputField tiffOutputField = new TiffOutputField(tiffField.getTag(), tagInfo, fieldType, encodeValue.length / fieldType.getSize(), encodeValue);
                        tiffOutputField.setSortHint(tiffField.getSortHint());
                        tiffOutputDirectory.add(tiffOutputField);
                    }
                }
                tiffOutputDirectory.setTiffImageData(getTiffImageData());
                tiffOutputDirectory.setJpegImageData(getJpegImageData());
                return tiffOutputDirectory;
            } catch (ImageReadException e) {
                throw new ImageWriteException(e.getMessage(), (Throwable) e);
            }
        }

        public BufferedImage getThumbnail() {
            return this.directory.getTiffImage(this.byteOrder);
        }

        public TiffImageData getTiffImageData() {
            return this.directory.getTiffImageData();
        }

        @Override // org.apache.commons.imaging.common.GenericImageMetadata, org.apache.commons.imaging.common.ImageMetadata
        public String toString(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str != null ? str : "");
            sb.append(this.directory.description());
            sb.append(": ");
            sb.append(getTiffImageData() != null ? " (tiffImageData)" : "");
            sb.append(getJpegImageData() != null ? " (jpegImageData)" : "");
            sb.append("\n");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, super.toString(str), "\n");
        }
    }

    public static class GPSInfo {
        public final RationalNumber latitudeDegrees;
        public final RationalNumber latitudeMinutes;
        public final String latitudeRef;
        public final RationalNumber latitudeSeconds;
        public final RationalNumber longitudeDegrees;
        public final RationalNumber longitudeMinutes;
        public final String longitudeRef;
        public final RationalNumber longitudeSeconds;

        public GPSInfo(String str, String str2, RationalNumber rationalNumber, RationalNumber rationalNumber2, RationalNumber rationalNumber3, RationalNumber rationalNumber4, RationalNumber rationalNumber5, RationalNumber rationalNumber6) {
            this.latitudeRef = str;
            this.longitudeRef = str2;
            this.latitudeDegrees = rationalNumber;
            this.latitudeMinutes = rationalNumber2;
            this.latitudeSeconds = rationalNumber3;
            this.longitudeDegrees = rationalNumber4;
            this.longitudeMinutes = rationalNumber5;
            this.longitudeSeconds = rationalNumber6;
        }

        public double getLatitudeAsDegreesNorth() {
            double doubleValue = (this.latitudeSeconds.doubleValue() / 3600.0d) + (this.latitudeMinutes.doubleValue() / 60.0d) + this.latitudeDegrees.doubleValue();
            if (this.latitudeRef.trim().equalsIgnoreCase("n")) {
                return doubleValue;
            }
            if (this.latitudeRef.trim().equalsIgnoreCase("s")) {
                return -doubleValue;
            }
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Unknown latitude ref: \""), this.latitudeRef, "\""));
        }

        public double getLongitudeAsDegreesEast() {
            double doubleValue = (this.longitudeSeconds.doubleValue() / 3600.0d) + (this.longitudeMinutes.doubleValue() / 60.0d) + this.longitudeDegrees.doubleValue();
            if (this.longitudeRef.trim().equalsIgnoreCase("e")) {
                return doubleValue;
            }
            if (this.longitudeRef.trim().equalsIgnoreCase("w")) {
                return -doubleValue;
            }
            throw new ImageReadException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Unknown longitude ref: \""), this.longitudeRef, "\""));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[GPS. Latitude: ");
            sb.append(this.latitudeDegrees.toDisplayString());
            sb.append(" degrees, ");
            sb.append(this.latitudeMinutes.toDisplayString());
            sb.append(" minutes, ");
            sb.append(this.latitudeSeconds.toDisplayString());
            sb.append(" seconds ");
            sb.append(this.latitudeRef);
            sb.append(", Longitude: ");
            sb.append(this.longitudeDegrees.toDisplayString());
            sb.append(" degrees, ");
            sb.append(this.longitudeMinutes.toDisplayString());
            sb.append(" minutes, ");
            sb.append(this.longitudeSeconds.toDisplayString());
            sb.append(" seconds ");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.longitudeRef, ']');
        }
    }

    public static class TiffMetadataItem extends GenericImageMetadata.GenericImageMetadataItem {
        private final TiffField entry;

        public TiffMetadataItem(TiffField tiffField) {
            super(tiffField.getTagName(), tiffField.getValueDescription());
            this.entry = tiffField;
        }

        public TiffField getTiffField() {
            return this.entry;
        }
    }

    public TiffImageMetadata(TiffContents tiffContents) {
        this.contents = tiffContents;
    }

    public TiffDirectory findDirectory(int i) {
        Iterator<? extends ImageMetadata.ImageMetadataItem> it = getDirectories().iterator();
        while (it.hasNext()) {
            Directory directory = (Directory) it.next();
            if (directory.f1556type == i) {
                return directory.directory;
            }
        }
        return null;
    }

    public TiffField findField(TagInfo tagInfo, boolean z) {
        TiffField findField;
        TiffField findField2;
        Integer tagCount = TiffTags.getTagCount(tagInfo.tag);
        int intValue = tagCount == null ? 0 : tagCount.intValue();
        List<? extends ImageMetadata.ImageMetadataItem> directories = getDirectories();
        if (z || tagInfo.directoryType != TiffDirectoryType.EXIF_DIRECTORY_UNKNOWN) {
            Iterator<? extends ImageMetadata.ImageMetadataItem> it = directories.iterator();
            while (it.hasNext()) {
                Directory directory = (Directory) it.next();
                if (directory.f1556type == tagInfo.directoryType.directoryType && (findField2 = directory.findField(tagInfo)) != null) {
                    return findField2;
                }
            }
            if (!z && intValue <= 1) {
                Iterator<? extends ImageMetadata.ImageMetadataItem> it2 = directories.iterator();
                while (it2.hasNext()) {
                    Directory directory2 = (Directory) it2.next();
                    if (tagInfo.directoryType.isImageDirectory() && directory2.f1556type >= 0) {
                        TiffField findField3 = directory2.findField(tagInfo);
                        if (findField3 != null) {
                            return findField3;
                        }
                    } else if (!tagInfo.directoryType.isImageDirectory() && directory2.f1556type < 0 && (findField = directory2.findField(tagInfo)) != null) {
                        return findField;
                    }
                }
            }
            return null;
        }
        Iterator<? extends ImageMetadata.ImageMetadataItem> it3 = directories.iterator();
        while (it3.hasNext()) {
            TiffField findField4 = ((Directory) it3.next()).findField(tagInfo);
            if (findField4 != null) {
                return findField4;
            }
        }
        return null;
    }

    public List<TiffField> getAllFields() {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends ImageMetadata.ImageMetadataItem> it = getDirectories().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Directory) it.next()).getAllFields());
        }
        return arrayList;
    }

    public List<? extends ImageMetadata.ImageMetadataItem> getDirectories() {
        return super.getItems();
    }

    public String[] getFieldValue(TagInfoAscii tagInfoAscii) {
        TiffField findField = findField(tagInfoAscii);
        if (findField == null || !tagInfoAscii.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoAscii.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public GPSInfo getGPS() {
        TiffDirectory findDirectory = findDirectory(-3);
        if (findDirectory == null) {
            return null;
        }
        TiffField findField = findDirectory.findField(GpsTagConstants.GPS_TAG_GPS_LATITUDE_REF);
        TiffField findField2 = findDirectory.findField(GpsTagConstants.GPS_TAG_GPS_LATITUDE);
        TiffField findField3 = findDirectory.findField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE_REF);
        TiffField findField4 = findDirectory.findField(GpsTagConstants.GPS_TAG_GPS_LONGITUDE);
        if (findField != null && findField2 != null && findField3 != null && findField4 != null) {
            String stringValue = findField.getStringValue();
            RationalNumber[] rationalNumberArr = (RationalNumber[]) findField2.getValue();
            String stringValue2 = findField3.getStringValue();
            RationalNumber[] rationalNumberArr2 = (RationalNumber[]) findField4.getValue();
            if (rationalNumberArr.length == 3 && rationalNumberArr2.length == 3) {
                return new GPSInfo(stringValue, stringValue2, rationalNumberArr[0], rationalNumberArr[1], rationalNumberArr[2], rationalNumberArr2[0], rationalNumberArr2[1], rationalNumberArr2[2]);
            }
            f$$ExternalSyntheticLambda0.m("Expected three values for latitude and longitude.");
        }
        return null;
    }

    @Override // org.apache.commons.imaging.common.GenericImageMetadata, org.apache.commons.imaging.common.ImageMetadata
    public List<? extends ImageMetadata.ImageMetadataItem> getItems() {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends ImageMetadata.ImageMetadataItem> it = super.getItems().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Directory) it.next()).getItems());
        }
        return arrayList;
    }

    public TiffOutputSet getOutputSet() {
        ByteOrder byteOrder = this.contents.header.byteOrder;
        TiffOutputSet tiffOutputSet = new TiffOutputSet(byteOrder);
        Iterator<? extends ImageMetadata.ImageMetadataItem> it = getDirectories().iterator();
        while (it.hasNext()) {
            Directory directory = (Directory) it.next();
            if (tiffOutputSet.findDirectory(directory.f1556type) == null) {
                tiffOutputSet.addDirectory(directory.getOutputDirectory(byteOrder));
            }
        }
        return tiffOutputSet;
    }

    public byte[] getFieldValue(TagInfoByte tagInfoByte) {
        TiffField findField = findField(tagInfoByte);
        if (findField != null && tagInfoByte.dataTypes.contains(findField.getFieldType())) {
            return findField.getByteArrayValue();
        }
        return null;
    }

    public Object getFieldValue(TagInfo tagInfo) {
        TiffField findField = findField(tagInfo);
        if (findField == null) {
            return null;
        }
        return findField.getValue();
    }

    public short[] getFieldValue(TagInfoShorts tagInfoShorts) {
        TiffField findField = findField(tagInfoShorts);
        if (findField == null || !tagInfoShorts.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoShorts.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public int[] getFieldValue(TagInfoLongs tagInfoLongs) {
        TiffField findField = findField(tagInfoLongs);
        if (findField == null || !tagInfoLongs.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoLongs.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public RationalNumber[] getFieldValue(TagInfoRationals tagInfoRationals) {
        TiffField findField = findField(tagInfoRationals);
        if (findField == null || !tagInfoRationals.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoRationals.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public byte[] getFieldValue(TagInfoSBytes tagInfoSBytes) {
        TiffField findField = findField(tagInfoSBytes);
        if (findField != null && tagInfoSBytes.dataTypes.contains(findField.getFieldType())) {
            return findField.getByteArrayValue();
        }
        return null;
    }

    public short[] getFieldValue(TagInfoSShorts tagInfoSShorts) {
        TiffField findField = findField(tagInfoSShorts);
        if (findField == null || !tagInfoSShorts.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoSShorts.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public int[] getFieldValue(TagInfoSLongs tagInfoSLongs) {
        TiffField findField = findField(tagInfoSLongs);
        if (findField == null || !tagInfoSLongs.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoSLongs.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public RationalNumber[] getFieldValue(TagInfoSRationals tagInfoSRationals) {
        TiffField findField = findField(tagInfoSRationals);
        if (findField == null || !tagInfoSRationals.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoSRationals.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public float[] getFieldValue(TagInfoFloats tagInfoFloats) {
        TiffField findField = findField(tagInfoFloats);
        if (findField == null || !tagInfoFloats.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoFloats.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public double[] getFieldValue(TagInfoDoubles tagInfoDoubles) {
        TiffField findField = findField(tagInfoDoubles);
        if (findField == null || !tagInfoDoubles.dataTypes.contains(findField.getFieldType())) {
            return null;
        }
        return tagInfoDoubles.getValue(findField.getByteOrder(), findField.getByteArrayValue());
    }

    public String getFieldValue(TagInfoGpsText tagInfoGpsText) {
        TiffField findField = findField(tagInfoGpsText);
        if (findField == null) {
            return null;
        }
        return tagInfoGpsText.getValue(findField);
    }

    public String getFieldValue(TagInfoXpString tagInfoXpString) {
        TiffField findField = findField(tagInfoXpString);
        if (findField == null) {
            return null;
        }
        return tagInfoXpString.getValue(findField);
    }

    public TiffField findField(TagInfo tagInfo) {
        return findField(tagInfo, false);
    }
}
